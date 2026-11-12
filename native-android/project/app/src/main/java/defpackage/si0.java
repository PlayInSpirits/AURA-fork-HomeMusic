package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.Trace;
import android.util.Log;
import android.util.Xml;
import androidx.compose.runtime.tooling.DiagnosticComposeException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class si0 implements u75 {
    public static final Object a = new Object();
    public static final n7 b = new n7(13);
    public static final byte[] c = {112, 114, 111, 0};
    public static final byte[] d = {112, 114, 109, 0};
    public static final p61 e;
    public static final p61[] f;

    static {
        p61 p61Var = new p61("auth_blockstore", 3L);
        p61 p61Var2 = new p61("blockstore_data_transfer", 1L);
        p61 p61Var3 = new p61("blockstore_notify_app_restore", 1L);
        p61 p61Var4 = new p61("blockstore_store_bytes_with_options", 2L);
        p61 p61Var5 = new p61("blockstore_is_end_to_end_encryption_available", 1L);
        p61 p61Var6 = new p61("blockstore_enable_cloud_backup", 1L);
        p61 p61Var7 = new p61("blockstore_delete_bytes", 2L);
        p61 p61Var8 = new p61("blockstore_retrieve_bytes_with_options", 3L);
        p61 p61Var9 = new p61("auth_clear_restore_credential", 1L);
        p61 p61Var10 = new p61("auth_create_restore_credential", 1L);
        p61 p61Var11 = new p61("auth_get_restore_credential", 1L);
        e = p61Var11;
        f = new p61[]{p61Var, p61Var2, p61Var3, p61Var4, p61Var5, p61Var6, p61Var7, p61Var8, p61Var9, p61Var10, p61Var11};
    }

    public static final int A(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean B(li0 li0Var, int i, int i2) {
        li0Var.getClass();
        if (i > i2 && li0Var.l) {
            return false;
        }
        Set set = li0Var.m;
        return li0Var.k && (set == null || !set.contains(Integer.valueOf(i)));
    }

    public static ba4 C(wf1 wf1Var) {
        ba4 ba4Var = new ba4();
        ba4Var.q = ya4.i(ba4Var, ba4Var, wf1Var);
        return ba4Var;
    }

    public static String D(gr1 gr1Var) {
        gr1Var.getClass();
        yw ywVar = yw.q;
        return pa.t(gr1Var.i).c("MD5").e();
    }

    public static do2 E(Child child) {
        child.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("id", child.getId());
        bundle.putString("type", "music");
        bundle.putString("title", child.getTitle());
        bundle.putString("artist", child.getArtist());
        bundle.putString("albumId", child.getAlbumId());
        bundle.putString("artistId", child.getArtistId());
        bundle.putString("coverArtId", child.getCoverArtId());
        bundle.putString("suffix", child.getSuffix());
        Integer duration = child.getDuration();
        bundle.putInt("duration", duration != null ? duration.intValue() : 0);
        Integer bitrate = child.getBitrate();
        bundle.putInt("bitrate", bitrate != null ? bitrate.intValue() : 0);
        co2 co2Var = new co2();
        co2Var.a = child.getTitle();
        co2Var.b = child.getArtist();
        co2Var.c = child.getAlbum();
        co2Var.H = bundle;
        return new do2(co2Var);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void F(Context context, String str) {
        synchronized (a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e2);
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
            } catch (FileNotFoundException unused3) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    public static int[] G(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iV = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iV += (int) fh0.v(byteArrayInputStream, 2);
            iArr[i2] = iV;
        }
        return iArr;
    }

    public static int H(xu3 xu3Var) throws IOException {
        try {
            tv tvVar = xu3Var.o;
            xu3Var.P(1L);
            long j = 0;
            while (true) {
                long j2 = j + 1;
                if (!xu3Var.G(j2)) {
                    break;
                }
                byte bQ = tvVar.q(j);
                if ((bQ >= 48 && bQ <= 57) || (j == 0 && bQ == 45)) {
                    j = j2;
                }
                if (j != 0) {
                    break;
                }
                ya4.g(16);
                String string = Integer.toString(bQ, 16);
                string.getClass();
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            long jH = tvVar.H();
            String strT = xu3Var.t(Long.MAX_VALUE);
            if (jH >= 0 && jH <= 2147483647L && strT.length() <= 0) {
                return (int) jH;
            }
            throw new IOException("expected an int but was \"" + jH + strT + '\"');
        } catch (NumberFormatException e2) {
            mj0.i(e2.getMessage());
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
  0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String I(Context context) {
        String attributeValue;
        synchronized (a) {
            attributeValue = "";
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    try {
                        try {
                            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                            xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                            int depth = xmlPullParserNewPullParser.getDepth();
                            while (true) {
                                int next = xmlPullParserNewPullParser.next();
                                if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                    if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                        attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException | XmlPullParserException unused3) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }

    public static jp0[] J(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, jp0[] jp0VarArr) throws IOException {
        byte[] bArr3 = au0.C;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, au0.D)) {
                kf2.o("Unsupported meta version");
                return null;
            }
            int iV = (int) fh0.v(fileInputStream, 2);
            byte[] bArrU = fh0.u(fileInputStream, (int) fh0.v(fileInputStream, 4), (int) fh0.v(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                kf2.o("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrU);
            try {
                jp0[] jp0VarArrL = L(byteArrayInputStream, bArr2, iV, jp0VarArr);
                byteArrayInputStream.close();
                return jp0VarArrL;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(au0.x, bArr2)) {
            kf2.o("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            kf2.o("Unsupported meta version");
            return null;
        }
        int iV2 = (int) fh0.v(fileInputStream, 1);
        byte[] bArrU2 = fh0.u(fileInputStream, (int) fh0.v(fileInputStream, 4), (int) fh0.v(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            kf2.o("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrU2);
        try {
            jp0[] jp0VarArrK = K(byteArrayInputStream2, iV2, jp0VarArr);
            byteArrayInputStream2.close();
            return jp0VarArrK;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static jp0[] K(ByteArrayInputStream byteArrayInputStream, int i, jp0[] jp0VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new jp0[0];
        }
        if (i != jp0VarArr.length) {
            kf2.o("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iV = (int) fh0.v(byteArrayInputStream, 2);
            iArr[i2] = (int) fh0.v(byteArrayInputStream, 2);
            strArr[i2] = new String(fh0.t(byteArrayInputStream, iV), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            jp0 jp0Var = jp0VarArr[i3];
            if (!jp0Var.b.equals(strArr[i3])) {
                kf2.o("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            jp0Var.e = i4;
            jp0Var.h = G(byteArrayInputStream, i4);
        }
        return jp0VarArr;
    }

    public static jp0[] L(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, jp0[] jp0VarArr) throws IOException {
        jp0 jp0Var;
        if (byteArrayInputStream.available() == 0) {
            return new jp0[0];
        }
        if (i != jp0VarArr.length) {
            kf2.o("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            fh0.v(byteArrayInputStream, 2);
            String str = new String(fh0.t(byteArrayInputStream, (int) fh0.v(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jV = fh0.v(byteArrayInputStream, 4);
            int iV = (int) fh0.v(byteArrayInputStream, 2);
            if (jp0VarArr.length <= 0) {
                jp0Var = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i3 = 0;
            while (true) {
                if (i3 >= jp0VarArr.length) {
                    jp0Var = null;
                    break;
                }
                if (jp0VarArr[i3].b.equals(strSubstring)) {
                    jp0Var = jp0VarArr[i3];
                    break;
                }
                i3++;
            }
            if (jp0Var == null) {
                kf2.o("Missing profile key: ".concat(str));
                return null;
            }
            jp0Var.d = jV;
            int[] iArrG = G(byteArrayInputStream, iV);
            if (Arrays.equals(bArr, au0.B)) {
                jp0Var.e = iV;
                jp0Var.h = iArrG;
            }
        }
        return jp0VarArr;
    }

    public static jp0[] M(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, au0.y)) {
            kf2.o("Unsupported version");
            return null;
        }
        int iV = (int) fh0.v(fileInputStream, 1);
        byte[] bArrU = fh0.u(fileInputStream, (int) fh0.v(fileInputStream, 4), (int) fh0.v(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            kf2.o("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrU);
        try {
            jp0[] jp0VarArrN = N(byteArrayInputStream, str, iV);
            byteArrayInputStream.close();
            return jp0VarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static jp0[] N(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new jp0[0];
        }
        jp0[] jp0VarArr = new jp0[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iV = (int) fh0.v(byteArrayInputStream, 2);
            int iV2 = (int) fh0.v(byteArrayInputStream, 2);
            jp0VarArr[i3] = new jp0(str, new String(fh0.t(byteArrayInputStream, iV), StandardCharsets.UTF_8), fh0.v(byteArrayInputStream, 4), iV2, (int) fh0.v(byteArrayInputStream, 4), (int) fh0.v(byteArrayInputStream, 4), new int[iV2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            jp0 jp0Var = jp0VarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = jp0Var.f;
            int i6 = jp0Var.g;
            TreeMap treeMap = jp0Var.i;
            int i7 = iAvailable - i5;
            int iV3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iV3 += (int) fh0.v(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iV3), 1);
                int iV4 = (int) fh0.v(byteArrayInputStream, 2);
                while (iV4 > 0) {
                    fh0.v(byteArrayInputStream, 2);
                    int iV5 = (int) fh0.v(byteArrayInputStream, 1);
                    if (iV5 != 6 && iV5 != 7) {
                        while (iV5 > 0) {
                            fh0.v(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iV6 = (int) fh0.v(byteArrayInputStream, 1); iV6 > 0; iV6--) {
                                fh0.v(byteArrayInputStream, 2);
                            }
                            iV5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iV4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                kf2.o("Read too much data during profile line parse");
                return null;
            }
            jp0Var.h = G(byteArrayInputStream, jp0Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(fh0.t(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return jp0VarArr;
    }

    public static final void O(lg4 lg4Var, int i, Object obj) {
        int iH = lg4Var.h(i);
        Object[] objArr = lg4Var.c;
        Object obj2 = objArr[iH];
        objArr[iH] = j80.a;
        if (obj == obj2) {
            return;
        }
        l80.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ")");
    }

    public static final String P(vd0 vd0Var) {
        Object s14Var;
        if (vd0Var instanceof mr0) {
            return ((mr0) vd0Var).toString();
        }
        try {
            s14Var = vd0Var + '@' + x(vd0Var);
        } catch (Throwable th) {
            s14Var = new s14(th);
        }
        if (bb3.a(s14Var) != null) {
            s14Var = vd0Var.getClass().getName() + '@' + x(vd0Var);
        }
        return (String) s14Var;
    }

    public static Float Q(float f2) {
        if (Float.isNaN(f2)) {
            return null;
        }
        return Float.valueOf(f2);
    }

    public static final void R(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    public static boolean S(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, jp0[] jp0VarArr) throws IOException {
        int i;
        long j;
        int length;
        byte[] bArr2 = au0.B;
        byte[] bArr3 = au0.A;
        byte[] bArr4 = au0.x;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = au0.y;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrP = p(jp0VarArr, bArr5);
                fh0.z(byteArrayOutputStream, jp0VarArr.length, 1);
                fh0.z(byteArrayOutputStream, bArrP.length, 4);
                byte[] bArrH = fh0.h(bArrP);
                fh0.z(byteArrayOutputStream, bArrH.length, 4);
                byteArrayOutputStream.write(bArrH);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                fh0.z(byteArrayOutputStream, jp0VarArr.length, 1);
                for (jp0 jp0Var : jp0VarArr) {
                    int size = jp0Var.i.size() * 4;
                    String strW = w(bArr3, jp0Var.a, jp0Var.b);
                    Charset charset = StandardCharsets.UTF_8;
                    fh0.A(byteArrayOutputStream, strW.getBytes(charset).length);
                    fh0.A(byteArrayOutputStream, jp0Var.h.length);
                    fh0.z(byteArrayOutputStream, size, 4);
                    fh0.z(byteArrayOutputStream, jp0Var.c, 4);
                    byteArrayOutputStream.write(strW.getBytes(charset));
                    Iterator it = jp0Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        fh0.A(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        fh0.A(byteArrayOutputStream, 0);
                    }
                    for (int i3 : jp0Var.h) {
                        fh0.A(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = au0.z;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrP2 = p(jp0VarArr, bArr6);
                fh0.z(byteArrayOutputStream, jp0VarArr.length, 1);
                fh0.z(byteArrayOutputStream, bArrP2.length, 4);
                byte[] bArrH2 = fh0.h(bArrP2);
                fh0.z(byteArrayOutputStream, bArrH2.length, 4);
                byteArrayOutputStream.write(bArrH2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            fh0.A(byteArrayOutputStream, jp0VarArr.length);
            for (jp0 jp0Var2 : jp0VarArr) {
                String str = jp0Var2.a;
                TreeMap treeMap = jp0Var2.i;
                String strW2 = w(bArr2, str, jp0Var2.b);
                Charset charset2 = StandardCharsets.UTF_8;
                fh0.A(byteArrayOutputStream, strW2.getBytes(charset2).length);
                fh0.A(byteArrayOutputStream, treeMap.size());
                fh0.A(byteArrayOutputStream, jp0Var2.h.length);
                fh0.z(byteArrayOutputStream, jp0Var2.c, 4);
                byteArrayOutputStream.write(strW2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    fh0.A(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : jp0Var2.h) {
                    fh0.A(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            fh0.A(byteArrayOutputStream2, jp0VarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (jp0 jp0Var3 : jp0VarArr) {
                fh0.z(byteArrayOutputStream2, jp0Var3.c, 4);
                fh0.z(byteArrayOutputStream2, jp0Var3.d, 4);
                fh0.z(byteArrayOutputStream2, jp0Var3.g, 4);
                String strW3 = w(bArr4, jp0Var3.a, jp0Var3.b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strW3.getBytes(charset3).length;
                fh0.A(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strW3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            ce5 ce5Var = new ce5(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList.add(ce5Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < jp0VarArr.length) {
                try {
                    jp0 jp0Var4 = jp0VarArr[i7];
                    fh0.A(byteArrayOutputStream3, i7);
                    fh0.A(byteArrayOutputStream3, jp0Var4.e);
                    i8 = i8 + 4 + (jp0Var4.e * i5);
                    int[] iArr = jp0Var4.h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        fh0.A(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            ce5 ce5Var2 = new ce5(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList.add(ce5Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < jp0VarArr.length; i13++) {
                try {
                    jp0 jp0Var5 = jp0VarArr[i13];
                    Iterator it3 = jp0Var5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        X(byteArrayOutputStream5, iIntValue, jp0Var5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            Y(byteArrayOutputStream6, jp0Var5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            fh0.A(byteArrayOutputStream4, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i12 + 6;
                            fh0.z(byteArrayOutputStream4, length4, 4);
                            fh0.A(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i12 = i14 + length4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            ce5 ce5Var3 = new ce5(4, true, byteArray5);
            byteArrayOutputStream4.close();
            arrayList.add(ce5Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            fh0.z(byteArrayOutputStream, arrayList.size(), 4);
            int i15 = 0;
            while (i15 < arrayList.size()) {
                ce5 ce5Var4 = (ce5) arrayList.get(i15);
                int i16 = ce5Var4.a;
                byte[] bArr7 = ce5Var4.b;
                if (i16 != 1) {
                    i = i11;
                    if (i16 == i) {
                        j = 1;
                    } else if (i16 == 3) {
                        j = 2;
                    } else if (i16 == 4) {
                        j = 3;
                    } else {
                        if (i16 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                } else {
                    i = i11;
                    j = 0;
                }
                fh0.z(byteArrayOutputStream, j, 4);
                fh0.z(byteArrayOutputStream, size2, 4);
                if (ce5Var4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrH3 = fh0.h(bArr7);
                    arrayList2.add(bArrH3);
                    fh0.z(byteArrayOutputStream, bArrH3.length, 4);
                    fh0.z(byteArrayOutputStream, length5, 4);
                    length = bArrH3.length;
                } else {
                    arrayList2.add(bArr7);
                    fh0.z(byteArrayOutputStream, bArr7.length, 4);
                    fh0.z(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                i11 = i;
            }
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i17));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static final boolean T(Throwable th, gf1 gf1Var) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = m22.a;
        DiagnosticComposeException diagnosticComposeException = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = tg3.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = u01.n;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            c80 c80Var = (c80) gf1Var.invoke();
            if (c80Var != null) {
                boolean z2 = c80Var.b;
                List list = c80Var.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((d80) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                c80Var.getClass();
                diagnosticComposeException = new DiagnosticComposeException(c80Var);
            }
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            j51.d(th, diagnosticComposeException);
        }
        return z;
    }

    public static Set U(tl1 tl1Var) {
        int size = tl1Var.size();
        TreeSet treeSet = null;
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(tl1Var.b(i))) {
                String strE = tl1Var.e(i);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    comparator.getClass();
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = qm4.D0(strE, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(qm4.K0((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? z01.n : treeSet;
    }

    public static void V(ByteArrayOutputStream byteArrayOutputStream, jp0 jp0Var) throws IOException {
        Y(byteArrayOutputStream, jp0Var);
        int i = jp0Var.g;
        int[] iArr = jp0Var.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            fh0.A(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : jp0Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void W(ByteArrayOutputStream byteArrayOutputStream, jp0 jp0Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        fh0.A(byteArrayOutputStream, str.getBytes(charset).length);
        fh0.A(byteArrayOutputStream, jp0Var.e);
        fh0.z(byteArrayOutputStream, jp0Var.f, 4);
        fh0.z(byteArrayOutputStream, jp0Var.c, 4);
        fh0.z(byteArrayOutputStream, jp0Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void X(ByteArrayOutputStream byteArrayOutputStream, int i, jp0 jp0Var) throws IOException {
        int i2 = jp0Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : jp0Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void Y(ByteArrayOutputStream byteArrayOutputStream, jp0 jp0Var) throws IOException {
        int i = 0;
        for (Map.Entry entry : jp0Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                fh0.A(byteArrayOutputStream, iIntValue - i);
                fh0.A(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static final void Z(Bundle bundle, ReplayGainInfo replayGainInfo) {
        if (replayGainInfo == null || !replayGainInfo.hasAnyValue()) {
            bundle.putBoolean("rg_present", false);
            return;
        }
        bundle.putBoolean("rg_present", true);
        Float trackGain = replayGainInfo.getTrackGain();
        bundle.putFloat("rg_trackGain", trackGain != null ? trackGain.floatValue() : Float.NaN);
        Float albumGain = replayGainInfo.getAlbumGain();
        bundle.putFloat("rg_albumGain", albumGain != null ? albumGain.floatValue() : Float.NaN);
        Float trackPeak = replayGainInfo.getTrackPeak();
        bundle.putFloat("rg_trackPeak", trackPeak != null ? trackPeak.floatValue() : Float.NaN);
        Float albumPeak = replayGainInfo.getAlbumPeak();
        bundle.putFloat("rg_albumPeak", albumPeak != null ? albumPeak.floatValue() : Float.NaN);
        Float baseGain = replayGainInfo.getBaseGain();
        bundle.putFloat("rg_baseGain", baseGain != null ? baseGain.floatValue() : Float.NaN);
        Float fallbackGain = replayGainInfo.getFallbackGain();
        bundle.putFloat("rg_fallbackGain", fallbackGain != null ? fallbackGain.floatValue() : Float.NaN);
    }

    public static boolean a0(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = ni5.o;
            }
        } else {
            if (!(collection instanceof ki5)) {
                return false;
            }
            objComparator = ((ki5) collection).q;
        }
        return comparator.equals(objComparator);
    }

    public static Object d(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void e(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final Object[] f(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ti.c0(0, i, 6, objArr, objArr2);
        ti.Z(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] g(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ti.c0(0, i, 6, objArr, objArr2);
        ti.Z(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] h(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ti.c0(0, i, 6, objArr, objArr2);
        ti.Z(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final void i(int i, int i2, List list) {
        int iT = t(list, i);
        if (iT < 0) {
            iT = -(iT + 1);
        }
        while (iT < list.size() && ((o12) list.get(iT)).b < i2) {
        }
    }

    public static void j(StringBuilder sb, Object obj, if1 if1Var) {
        if (if1Var != null) {
            sb.append((CharSequence) if1Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static int l(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, yh.b(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final void m(hg4 hg4Var, ArrayList arrayList, int i) {
        boolean zL = hg4Var.l(i);
        int[] iArr = hg4Var.b;
        if (zL) {
            arrayList.add(hg4Var.n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            m(hg4Var, arrayList, i3);
        }
    }

    public static long[] n(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        rr2.m(length == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", length);
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static sa1 o(Context context) {
        ProviderInfo providerInfo;
        pa1 pa1Var;
        ApplicationInfo applicationInfo;
        int i = 26;
        i80 nk0Var = Build.VERSION.SDK_INT >= 28 ? new nk0(i) : new i80(i);
        PackageManager packageManager = context.getPackageManager();
        l93.m(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            pa1Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrF = nk0Var.F(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrF) {
                    arrayList.add(signature.toByteArray());
                }
                pa1Var = new pa1(str, Collections.singletonList(arrayList), str2, "emojicompat-emoji-font", null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                pa1Var = null;
            }
        }
        if (pa1Var == null) {
            return null;
        }
        return new sa1(new ra1(context, pa1Var));
    }

    public static byte[] p(jp0[] jp0VarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (jp0 jp0Var : jp0VarArr) {
            length += ((((jp0Var.g * 2) + 7) & (-8)) / 8) + (jp0Var.e * 2) + w(bArr, jp0Var.a, jp0Var.b).getBytes(StandardCharsets.UTF_8).length + 16 + jp0Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, au0.z)) {
            int length2 = jp0VarArr.length;
            while (i < length2) {
                jp0 jp0Var2 = jp0VarArr[i];
                W(byteArrayOutputStream, jp0Var2, w(bArr, jp0Var2.a, jp0Var2.b));
                V(byteArrayOutputStream, jp0Var2);
                i++;
            }
        } else {
            for (jp0 jp0Var3 : jp0VarArr) {
                W(byteArrayOutputStream, jp0Var3, w(bArr, jp0Var3.a, jp0Var3.b));
            }
            int length3 = jp0VarArr.length;
            while (i < length3) {
                V(byteArrayOutputStream, jp0VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        nz2.d(byteArrayOutputStream.size(), length, " expected=", "The bytes saved do not match expectation. actual=");
        return null;
    }

    public static GetCredentialException q(String str, String str2) {
        Exception excC;
        str.getClass();
        try {
            GetPublicKeyCredentialDomException getPublicKeyCredentialDomException = new GetPublicKeyCredentialDomException(new h(26), null);
            if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excC = ji2.c(new h(0), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excC = ji2.c(new h(1), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excC = ji2.c(new h("androidx.credentials.TYPE_DATA_CLONE_ERROR"), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excC = ji2.c(new h(3), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excC = ji2.c(new h(4), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excC = ji2.c(new h("androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excC = ji2.c(new h("androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excC = ji2.c(new h("androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excC = ji2.c(new h("androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excC = ji2.c(new h("androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excC = ji2.c(new h(10), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excC = ji2.c(new h("androidx.credentials.TYPE_NAMESPACE_ERROR"), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excC = ji2.c(new h(12), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excC = ji2.c(new h("androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excC = ji2.c(new h(14), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excC = ji2.c(new h("androidx.credentials.TYPE_NOT_FOUND_ERROR"), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excC = ji2.c(new h(16), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excC = ji2.c(new h(17), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excC = ji2.c(new h("androidx.credentials.TYPE_OPERATION_ERROR"), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excC = ji2.c(new h("androidx.credentials.TYPE_OPT_OUT_ERROR"), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excC = ji2.c(new h("androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excC = ji2.c(new h("androidx.credentials.TYPE_READ_ONLY_ERROR"), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excC = ji2.c(new h(22), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excC = ji2.c(new h("androidx.credentials.TYPE_SYNTAX_ERROR"), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excC = ji2.c(new h(24), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excC = ji2.c(new h("androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excC = ji2.c(new h(26), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excC = ji2.c(new h("androidx.credentials.TYPE_VERSION_ERROR"), str2, getPublicKeyCredentialDomException);
            } else {
                if (!str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new FrameworkClassParsingException();
                }
                excC = ji2.c(new h("androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"), str2, getPublicKeyCredentialDomException);
            }
            return (GetCredentialException) excC;
        } catch (FrameworkClassParsingException unused) {
            return new GetCredentialCustomException(str2, str);
        }
    }

    public static boolean s(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final int t(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iJ = h12.j(((o12) list.get(i3)).b, i);
            if (iJ < 0) {
                i2 = i3 + 1;
            } else {
                if (iJ <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:45:0x0090 A[EDGE_INSN: B:45:0x0090->B:41:0x0090 BREAK  A[LOOP:0: B:11:0x0014->B:49:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0071 A[SYNTHETIC] */
    public static final List u(pz1 pz1Var, int i, int i2) {
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        kd3 kd3Var;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        pz1Var.getClass();
        if (i == i2) {
            return u01.n;
        }
        boolean z2 = i2 > i;
        ArrayList arrayList = new ArrayList();
        do {
            if (!z2) {
                if (i <= i2) {
                    return arrayList;
                }
                linkedHashMap = (LinkedHashMap) pz1Var.o;
                if (z2) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 == null) {
                        kd3Var = null;
                    } else {
                        kd3Var = new kd3(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        kd3Var = null;
                    } else {
                        kd3Var = new kd3(treeMap, treeMap.keySet());
                    }
                }
                if (kd3Var == null) {
                    Map map = (Map) kd3Var.n;
                    it = ((Iterable) kd3Var.o).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z = false;
                            break;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z2) {
                            if (i + 1 <= iIntValue) {
                                continue;
                            }
                        } else if (i2 <= iIntValue) {
                            continue;
                        }
                    }
                } else {
                    break;
                    break;
                }
            } else {
                if (i >= i2) {
                    return arrayList;
                }
                linkedHashMap = (LinkedHashMap) pz1Var.o;
                if (z2) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 == null) {
                        kd3Var = null;
                    } else {
                        kd3Var = new kd3(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        kd3Var = null;
                    } else {
                        kd3Var = new kd3(treeMap, treeMap.keySet());
                    }
                }
                if (kd3Var == null) {
                    Map map2 = (Map) kd3Var.n;
                    it = ((Iterable) kd3Var.o).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z = false;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z2) {
                            if (i2 <= iIntValue && iIntValue < i) {
                                Object obj = map2.get(Integer.valueOf(iIntValue));
                                obj.getClass();
                                arrayList.add(obj);
                                z = true;
                                i = iIntValue;
                                break;
                                break;
                            }
                        } else if (i + 1 <= iIntValue && iIntValue <= i2) {
                            Object obj2 = map2.get(Integer.valueOf(iIntValue));
                            obj2.getClass();
                            arrayList.add(obj2);
                            z = true;
                            i = iIntValue;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        } while (z);
        return null;
    }

    public static final ReplayGainInfo v(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("rg_present", false)) {
            return null;
        }
        return new ReplayGainInfo(Q(bundle.getFloat("rg_trackGain", Float.NaN)), Q(bundle.getFloat("rg_albumGain", Float.NaN)), Q(bundle.getFloat("rg_trackPeak", Float.NaN)), Q(bundle.getFloat("rg_albumPeak", Float.NaN)), Q(bundle.getFloat("rg_baseGain", Float.NaN)), Q(bundle.getFloat("rg_fallbackGain", Float.NaN)));
    }

    public static String w(byte[] bArr, String str, String str2) {
        byte[] bArr2 = au0.A;
        byte[] bArr3 = au0.B;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return b11.q(xa3.i(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static final String x(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static int z(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @Override // defpackage.u75
    public void a() {
    }

    @Override // defpackage.u75
    public void b() {
    }

    public abstract void k(z34 z34Var, Object obj);

    public abstract String r();

    public void y(x34 x34Var, Object obj) {
        x34Var.getClass();
        if (obj == null) {
            return;
        }
        z34 z34VarU = x34Var.U(r());
        try {
            k(z34VarU, obj);
            z34VarU.O();
            ud3.e(z34VarU, null);
            ji2.x(x34Var);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ud3.e(z34VarU, th);
                throw th2;
            }
        }
    }
}
