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
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class si0 implements u75 {
    public static final Object a = null;
    public static final n7 b = null;
    public static final byte[] c = null;
    public static final byte[] d = null;
    public static final p61 e = null;
    public static final p61[] f = null;

    static {
        a = new Object();
        b = new n7(13);
        c = new byte[]{112, 114, 111, 0};
        d = new byte[]{112, 114, 109, 0};
        p61 r1 = new p61("auth_blockstore", 3);
        p61 r2 = new p61("blockstore_data_transfer", 1);
        p61 r3 = new p61("blockstore_notify_app_restore", 1);
        p61 r4 = new p61("blockstore_store_bytes_with_options", 2);
        p61 r5 = new p61("blockstore_is_end_to_end_encryption_available", 1);
        p61 r6 = new p61("blockstore_enable_cloud_backup", 1);
        p61 r7 = new p61("blockstore_delete_bytes", 2);
        p61 r8 = new p61("blockstore_retrieve_bytes_with_options", 3);
        p61 r9 = new p61("auth_clear_restore_credential", 1);
        p61 r10 = new p61("auth_create_restore_credential", 1);
        p61 r11 = new p61("auth_get_restore_credential", 1);
        e = r11;
        f = new p61[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11};
    }

    public static final int A(int r0, int r1) {
        return (r0 >> r1) & 31;
    }

    public static final boolean B(li0 r1, int r2, int r3) {
        r1.getClass();
        if (r2 > r3) goto L5;
    L7:
        Set r4 = r1.m;
        if (r1.k == false) goto L14;
        if (r4 != null) goto L11;
        return true;
    L11:
        if (r4.contains(Integer.valueOf(r2)) == true) goto L14;
        return true;
    L14:
        return false;
    L5:
        if (r1.l == false) goto L7;
        return false;
    }

    public static ba4 C(wf1 r1) {
        ba4 r0 = new ba4();
        r0.q = ya4.i(r0, r0, r1);
        return r0;
    }

    public static String D(gr1 r1) {
        r1.getClass();
        yw r0 = yw.q;
        return pa.t(r1.i).c("MD5").e();
    }

    public static do2 E(Child r4) {
        r4.getClass();
        Bundle r0 = new Bundle();
        r0.putString("id", r4.getId());
        r0.putString("type", "music");
        r0.putString("title", r4.getTitle());
        r0.putString("artist", r4.getArtist());
        r0.putString("albumId", r4.getAlbumId());
        r0.putString("artistId", r4.getArtistId());
        r0.putString("coverArtId", r4.getCoverArtId());
        r0.putString("suffix", r4.getSuffix());
        Integer r1 = r4.getDuration();
        int r2 = 0;
        if (r1 == null) goto L5;
        int r3 = r1.intValue();
    L6:
        r0.putInt("duration", r3);
        Integer r5 = r4.getBitrate();
        if (r5 == null) goto L9;
        r2 = r5.intValue();
    L9:
        r0.putInt("bitrate", r2);
        co2 r6 = new co2();
        r6.a = r4.getTitle();
        r6.b = r4.getArtist();
        r6.c = r4.getAlbum();
        r6.H = r0;
        return new do2(r6);
    L5:
        r3 = 0;
        goto L6
    }

    public static void F(Context r5, String r6) {
        Object r0 = a;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r6.equals("") == false) goto L44;
        r5.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L44:
        FileOutputStream r7 = r5.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);     // Catch: Throwable -> L9 FileNotFoundException -> L29
        XmlSerializer r1 = Xml.newSerializer();     // Catch: Throwable -> L9
        r1.setOutput(r7, null);     // Catch: Throwable -> L18 Exception -> L20
        r1.startDocument("UTF-8", Boolean.TRUE);     // Catch: Throwable -> L18 Exception -> L20
        r1.startTag(null, "locales");     // Catch: Throwable -> L18 Exception -> L20
        r1.attribute(null, "application_locales", r6);     // Catch: Throwable -> L18 Exception -> L20
        r1.endTag(null, "locales");     // Catch: Throwable -> L18 Exception -> L20
        r1.endDocument();     // Catch: Throwable -> L18 Exception -> L20
        if (r7 != null) goto L42;
    L24:
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L42:
        r7.close();     // Catch: Throwable -> L9 IOException -> L34
        goto L24
    L18:
        th = move-exception;
        if (r7 != null) goto L40;
    L28:
        throw th;     // Catch: Throwable -> L9
    L40:
        r7.close();     // Catch: Throwable -> L9 IOException -> L35
    L20:
        e = move-exception;
        Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e);     // Catch: Throwable -> L18
        if (r7 == null) goto L24;
    L29:
        Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");     // Catch: Throwable -> L9
    }

    public static int[] G(ByteArrayInputStream r5, int r6) {
        int[] r0 = new int[r6];
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r6) goto L5;
        r2 = r2 + ((int) fh0.v(r5, 2));
        r0[r1] = r2;
        r1 = r1 + 1;
        goto L3
    L5:
        return r0;
    }

    public static int H(xu3 r12) {
        tv r1 = r12.o;     // Catch: NumberFormatException -> L30
        r12.P(1);     // Catch: NumberFormatException -> L30
        long r6 = 0;
    L4:
        long r8 = r6 + 1;     // Catch: NumberFormatException -> L30
        if (r12.G(r8) == false) goto L20;
        byte r10 = r1.q(r6);     // Catch: NumberFormatException -> L30
        if (r10 < 48) goto L11;
        if (r10 > 57) goto L11;
    L15:
        r6 = r8;
    L11:
        if (r6 != 0) goto L16;
        if (r10 == 45) goto L15;
    L16:
        if (r6 != 0) goto L20;
        ya4.g(16);     // Catch: NumberFormatException -> L30
        String r0 = Integer.toString(r10, 16);     // Catch: NumberFormatException -> L30
        r0.getClass();     // Catch: NumberFormatException -> L30
        throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(r0));     // Catch: NumberFormatException -> L30
    L20:
        long r2 = r1.H();     // Catch: NumberFormatException -> L30
        String r13 = r12.t(Long.MAX_VALUE);     // Catch: NumberFormatException -> L30
        if (r2 < 0) goto L29;
        if (r2 > 2147483647L) goto L29;
        if (r13.length() > 0) goto L29;
        return (int) r2;
    L29:
        throw new IOException("expected an int but was \"" + r2 + r13 + '\"');     // Catch: NumberFormatException -> L30
    L30:
        e = move-exception;
        mj0.i(e.getMessage());
        return 0;
    }

    public static String I(Context r8) {
        Object r0 = a;
        monitor-enter(r0);
        String r1 = "";
        FileInputStream r2 = r8.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");     // Catch: Throwable -> L26 FileNotFoundException -> L40
        XmlPullParser r3 = Xml.newPullParser();     // Catch: Throwable -> L14 Throwable -> L28
        r3.setInput(r2, "UTF-8");     // Catch: Throwable -> L14 Throwable -> L28
        int r4 = r3.getDepth();     // Catch: Throwable -> L14 Throwable -> L28
    L7:
        int r5 = r3.next();     // Catch: Throwable -> L14 Throwable -> L28
        if (r5 == 1) goto L23;
        if (r5 == 3) goto L12;
    L16:
        if (r5 == 3) goto L7;
        if (r5 == 4) goto L7;
        if (r3.getName().equals("locales") == false) goto L7;
        r1 = r3.getAttributeValue(null, "application_locales");     // Catch: Throwable -> L14 Throwable -> L28
    L12:
        if (r3.getDepth() > r4) goto L16;
    L23:
        if (r2 == null) goto L32;
    L48:
        r2.close();     // Catch: Throwable -> L26 IOException -> L44
    L32:
        if (r1.isEmpty() == false) goto L35;
        r8.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");     // Catch: Throwable -> L26
    L35:
        monitor-exit(r0);     // Catch: Throwable -> L26
        return r1;
    L14:
        th = move-exception;
        if (r2 != null) goto L46;
    L39:
        throw th;     // Catch: Throwable -> L26
    L46:
        r2.close();     // Catch: Throwable -> L26 IOException -> L45
    L28:
        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");     // Catch: Throwable -> L14
        if (r2 == null) goto L32;
    L26:
        th = move-exception;
        throw th;
    L41:
        return "";
    }

    public static jp0[] J(FileInputStream r7, byte[] r8, byte[] r9, jp0[] r10) {
        byte[] r0 = au0.C;
        if (Arrays.equals(r8, r0) == false) goto L27;
        if (Arrays.equals(au0.x, r9) == false) goto L7;
        kf2.o("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        return null;
    L7:
        if (Arrays.equals(r8, r0) == false) goto L22;
        int r11 = (int) fh0.v(r7, 1);
        long r1 = fh0.v(r7, 4);
        byte[] r12 = fh0.u(r7, (int) fh0.v(r7, 4), (int) r1);
        if (r7.read() > 0) goto L20;
        ByteArrayInputStream r13 = new ByteArrayInputStream(r12);
        jp0[] r14 = K(r13, r11, r10);     // Catch: Throwable -> L14
        r13.close();
        return r14;
    L14:
        th = move-exception;
        r13.close();     // Catch: Throwable -> L17
    L19:
        throw th;
    L17:
        th = move-exception;
        th.addSuppressed(th);
        goto L19
    L20:
        kf2.o("Content found after the end of file");
        return null;
    L22:
        kf2.o("Unsupported meta version");
        return null;
    L27:
        if (Arrays.equals(r8, au0.D) == false) goto L42;
        int r15 = (int) fh0.v(r7, 2);
        long r2 = fh0.v(r7, 4);
        byte[] r3 = fh0.u(r7, (int) fh0.v(r7, 4), (int) r2);
        if (r7.read() > 0) goto L40;
        ByteArrayInputStream r16 = new ByteArrayInputStream(r3);
        jp0[] r17 = L(r16, r9, r15, r10);     // Catch: Throwable -> L34
        r16.close();
        return r17;
    L34:
        th = move-exception;
        r16.close();     // Catch: Throwable -> L37
    L39:
        throw th;
    L37:
        th = move-exception;
        th.addSuppressed(th);
        goto L39
    L40:
        kf2.o("Content found after the end of file");
        return null;
    L42:
        kf2.o("Unsupported meta version");
        return null;
    }

    public static jp0[] K(ByteArrayInputStream r9, int r10, jp0[] r11) {
        int r1 = 0;
        if (r9.available() != 0) goto L7;
        return new jp0[0];
    L7:
        if (r10 != r11.length) goto L18;
        String[] r0 = new String[r10];
        int[] r3 = new int[r10];
        int r4 = 0;
    L9:
        if (r4 >= r10) goto L11;
        int r6 = (int) fh0.v(r9, 2);
        r3[r4] = (int) fh0.v(r9, 2);
        r0[r4] = new String(fh0.t(r9, r6), StandardCharsets.UTF_8);
        r4 = r4 + 1;
    L11:
        if (r1 >= r10) goto L17;
        jp0 r5 = r11[r1];
        if (r5.b.equals(r0[r1]) == false) goto L15;
        int r7 = r3[r1];
        r5.e = r7;
        r5.h = G(r9, r7);
        r1 = r1 + 1;
        goto L11
    L15:
        kf2.o("Order of dexfiles in metadata did not match baseline");
        return null;
    L17:
        return r11;
    L18:
        kf2.o("Mismatched number of dex files found in metadata");
        return null;
    }

    public static jp0[] L(ByteArrayInputStream r10, byte[] r11, int r12, jp0[] r13) {
        if (r10.available() != 0) goto L7;
        return new jp0[0];
    L7:
        if (r12 != r13.length) goto L34;
        int r0 = 0;
    L9:
        if (r0 >= r12) goto L33;
        fh0.v(r10, 2);
        String r5 = new String(fh0.t(r10, (int) fh0.v(r10, 2)), StandardCharsets.UTF_8);
        long r6 = fh0.v(r10, 4);
        int r3 = (int) fh0.v(r10, 2);
        if (r13.length > 0) goto L13;
    L12:
        jp0 r4 = null;
    L26:
        if (r4 == null) goto L31;
        r4.d = r6;
        int[] r7 = G(r10, r3);
        if (Arrays.equals(r11, au0.B) == false) goto L30;
        r4.e = r3;
        r4.h = r7;
    L30:
        r0 = r0 + 1;
        goto L9
    L31:
        kf2.o("Missing profile key: ".concat(r5));
        return null;
    L13:
        int r8 = r5.indexOf("!");
        if (r8 >= 0) goto L16;
        r8 = r5.indexOf(":");
    L16:
        if (r8 <= 0) goto L18;
        String r9 = r5.substring(r8 + 1);
    L19:
        int r14 = 0;
    L21:
        if (r14 >= r13.length) goto L12;
        if (r13[r14].b.equals(r9) == true) goto L24;
        r14 = r14 + 1;
        goto L21
    L24:
        r4 = r13[r14];
        goto L26
    L18:
        r9 = r5;
        goto L19
    L33:
        return r13;
    L34:
        kf2.o("Mismatched number of dex files found in metadata");
        return null;
    }

    public static jp0[] M(FileInputStream r6, byte[] r7, String r8) {
        if (Arrays.equals(r7, au0.y) == false) goto L18;
        int r9 = (int) fh0.v(r6, 1);
        long r2 = fh0.v(r6, 4);
        byte[] r1 = fh0.u(r6, (int) fh0.v(r6, 4), (int) r2);
        if (r6.read() > 0) goto L16;
        ByteArrayInputStream r10 = new ByteArrayInputStream(r1);
        jp0[] r11 = N(r10, r8, r9);     // Catch: Throwable -> L10
        r10.close();
        return r11;
    L10:
        th = move-exception;
        r10.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    L16:
        kf2.o("Content found after the end of file");
        return null;
    L18:
        kf2.o("Unsupported version");
        return null;
    }

    public static jp0[] N(ByteArrayInputStream r19, String r20, int r21) {
        int r3 = 0;
        if (r19.available() == 0) goto L5;
        jp0[] r2 = new jp0[r21];
        int r4 = 0;
    L8:
        if (r4 >= r21) goto L10;
        int r6 = (int) fh0.v(r19, 2);
        int r14 = (int) fh0.v(r19, 2);
        long r7 = fh0.v(r19, 4);
        r2[r4] = new jp0(r20, new String(fh0.t(r19, r6), StandardCharsets.UTF_8), fh0.v(r19, 4), r14, (int) r7, (int) fh0.v(r19, 4), new int[r14], new TreeMap());
        r4 = r4 + 1;
        goto L8
    L10:
        int r5 = 0;
    L11:
        if (r5 >= r21) goto L48;
        jp0 r8 = r2[r5];
        int r9 = r19.available();
        int r10 = r8.f;
        int r11 = r8.g;
        TreeMap r12 = r8.i;
        int r13 = r9 - r10;
        int r15 = r3;
    L14:
        if (r19.available() <= r13) goto L28;
        r15 = r15 + ((int) fh0.v(r19, 2));
        r12.put(Integer.valueOf(r15), 1);
        int r16 = (int) fh0.v(r19, 2);
    L16:
        if (r16 <= 0) goto L14;
        fh0.v(r19, 2);
        int r17 = (int) fh0.v(r19, 1);
        if (r17 == 6) goto L27;
        if (r17 == 7) goto L27;
    L22:
        if (r17 <= 0) goto L27;
        fh0.v(r19, 1);
        int r18 = r3;
        int r110 = r5;
        int r22 = (int) fh0.v(r19, 1);
    L24:
        if (r22 <= 0) goto L26;
        fh0.v(r19, 2);
        r22 = r22 - 1;
        goto L24
    L26:
        r17 = r17 - 1;
        r3 = r18;
        r5 = r110;
    L27:
        r16 = r16 - 1;
        r3 = r3;
        r5 = r5;
        goto L16
    L28:
        int r111 = r3;
        int r112 = r5;
        if (r19.available() != r13) goto L46;
        r8.h = G(r19, r8.e);
        BitSet r23 = BitSet.valueOf(fh0.t(r19, (((r11 * 2) + 7) & (-8)) / 8));
        int r24 = r111;
    L31:
        if (r24 >= r11) goto L45;
        if (r23.get(r24) == false) goto L35;
        int r25 = 2;
    L37:
        if (r23.get(r24 + r11) == false) goto L39;
        r25 = r25 | 4;
    L39:
        if (r25 == 0) goto L44;
        Integer r26 = (Integer) r12.get(Integer.valueOf(r24));
        if (r26 != null) goto L43;
        r26 = Integer.valueOf(r111);
    L43:
        r12.put(Integer.valueOf(r24), Integer.valueOf(r25 | r26.intValue()));
    L44:
        r24 = r24 + 1;
        goto L31
    L35:
        r25 = r111;
        goto L37
    L45:
        r5 = r112 + 1;
        r3 = r111;
        goto L11
    L46:
        kf2.o("Read too much data during profile line parse");
        return null;
    L48:
        return r2;
    L5:
        return new jp0[0];
    }

    public static final void O(lg4 r2, int r3, Object r4) {
        int r5 = r2.h(r3);
        Object[] r6 = r2.c;
        Object r0 = r6[r5];
        r6[r5] = j80.a;
        if (r4 != r0) goto L5;
        return;
    L5:
        l80.a("Slot table is out of sync (expected " + r4 + ", got " + r0 + ")");
    }

    public static final String P(vd0 r3) {
        if ((r3 instanceof mr0) == false) goto L17;
        return ((mr0) r3).toString();
    L17:
        Object r1 = r3 + '@' + x(r3);     // Catch: Throwable -> L9
    L12:
        if (bb3.a(r1) == null) goto L16;
        r1 = r3.getClass().getName() + '@' + x(r3);
    L16:
        return (String) r1;
    L9:
        th = move-exception;
        r1 = new s14(th);
        goto L12
    }

    public static Float Q(float r1) {
        if (Float.isNaN(r1) == false) goto L7;
        return null;
    L7:
        return Float.valueOf(r1);
    }

    public static final void R(String r2, long r3) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        z9.t(r2, r3);
        return;
    }

    public static boolean S(ByteArrayOutputStream r19, byte[] r20, jp0[] r21) {
        byte[] r3 = au0.B;
        byte[] r4 = au0.A;
        byte[] r5 = au0.x;
        int r8 = 0;
        if (Arrays.equals(r20, r5) == false) goto L111;
        ArrayList r1 = new ArrayList(3);
        ArrayList r6 = new ArrayList(3);
        ByteArrayOutputStream r7 = new ByteArrayOutputStream();
        fh0.A(r7, r21.length);     // Catch: Throwable -> L10
        int r10 = 2;
        int r11 = 0;
        int r12 = 2;
    L7:
        if (r11 >= r21.length) goto L12;
        jp0 r13 = r21[r11];     // Catch: Throwable -> L10
        fh0.z(r7, r13.c, 4);     // Catch: Throwable -> L10
        fh0.z(r7, r13.d, 4);     // Catch: Throwable -> L10
        fh0.z(r7, r13.g, 4);     // Catch: Throwable -> L10
        String r14 = w(r5, r13.a, r13.b);     // Catch: Throwable -> L10
        Charset r15 = StandardCharsets.UTF_8;     // Catch: Throwable -> L10
        int r16 = r14.getBytes(r15).length;     // Catch: Throwable -> L10
        fh0.A(r7, r16);     // Catch: Throwable -> L10
        r12 = (r12 + 14) + r16;     // Catch: Throwable -> L10
        r7.write(r14.getBytes(r15));     // Catch: Throwable -> L10
        r11 = r11 + 1;     // Catch: Throwable -> L10
        goto L7
    L12:
        byte[] r9 = r7.toByteArray();     // Catch: Throwable -> L10
        if (r12 != r9.length) goto L105;
        ce5 r17 = new ce5(1, false, r9);     // Catch: Throwable -> L10
        r7.close();
        r1.add(r17);
        ByteArrayOutputStream r18 = new ByteArrayOutputStream();
        int r22 = 0;
        int r110 = 0;
    L153:
    L24:
        th = move-exception;
        r18.close();     // Catch: Throwable -> L101
        throw th;
    L101:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L18:
        if (r22 >= r21.length) goto L26;
        jp0 r111 = r21[r22];     // Catch: Throwable -> L24
        fh0.A(r18, r22);     // Catch: Throwable -> L24
        fh0.A(r18, r111.e);     // Catch: Throwable -> L24
        r110 = (r110 + 4) + (r111.e * r10);     // Catch: Throwable -> L24
        int[] r112 = r111.h;     // Catch: Throwable -> L24
        int r113 = r112.length;     // Catch: Throwable -> L24
        int r114 = r8;
    L20:
        if (r8 >= r113) goto L22;
        int r115 = r112[r8];     // Catch: Throwable -> L24
        fh0.A(r18, r115 - r114);     // Catch: Throwable -> L24
        r8 = r8 + 1;     // Catch: Throwable -> L24
        r10 = r10;
        r114 = r115;
        goto L20
    L22:
        r22 = r22 + 1;     // Catch: Throwable -> L24
        r8 = 0;
        goto L153
    L26:
        int r23 = r10;
        byte[] r24 = r18.toByteArray();     // Catch: Throwable -> L24
        if (r110 != r24.length) goto L98;
        ce5 r25 = new ce5(3, true, r24);     // Catch: Throwable -> L24
        r18.close();
        r1.add(r25);
        ByteArrayOutputStream r26 = new ByteArrayOutputStream();
        int r27 = 0;
        int r28 = 0;
    L156:
    L42:
        th = move-exception;
        r26.close();     // Catch: Throwable -> L94
        throw th;
    L94:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L31:
        if (r27 >= r21.length) goto L58;
        jp0 r116 = r21[r27];     // Catch: Throwable -> L42
        Iterator r117 = r116.i.entrySet().iterator();     // Catch: Throwable -> L42
        int r118 = 0;
    L34:
        if (r117.hasNext() == false) goto L36;
        r118 = r118 | ((Integer) ((Map.Entry) r117.next()).getValue()).intValue();     // Catch: Throwable -> L42
        goto L34
    L36:
        ByteArrayOutputStream r119 = new ByteArrayOutputStream();     // Catch: Throwable -> L42
        X(r119, r118, r116);     // Catch: Throwable -> L51
        byte[] r120 = r119.toByteArray();     // Catch: Throwable -> L51
        r119.close();     // Catch: Throwable -> L42
        ByteArrayOutputStream r121 = new ByteArrayOutputStream();     // Catch: Throwable -> L42
        Y(r121, r116);     // Catch: Throwable -> L44
        byte[] r122 = r121.toByteArray();     // Catch: Throwable -> L44
        r121.close();     // Catch: Throwable -> L42
        fh0.A(r26, r27);     // Catch: Throwable -> L42
        int r123 = (r120.length + 2) + r122.length;     // Catch: Throwable -> L42
        int r29 = r28 + 6;     // Catch: Throwable -> L42
        fh0.z(r26, r123, 4);     // Catch: Throwable -> L42
        fh0.A(r26, r118);     // Catch: Throwable -> L42
        r26.write(r120);     // Catch: Throwable -> L42
        r26.write(r122);     // Catch: Throwable -> L42
        r28 = r29 + r123;
        r27 = r27 + 1;
        goto L156
    L44:
        th = move-exception;
        r121.close();     // Catch: Throwable -> L48
    L177:
        throw th;     // Catch: Throwable -> L42
    L48:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L42
        throw th;     // Catch: Throwable -> L42
    L51:
        th = move-exception;
        r119.close();     // Catch: Throwable -> L55
    L178:
        throw th;     // Catch: Throwable -> L42
    L55:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L42
        throw th;     // Catch: Throwable -> L42
    L58:
        byte[] r2 = r26.toByteArray();     // Catch: Throwable -> L42
        if (r28 != r2.length) goto L91;
        ce5 r30 = new ce5(4, true, r2);     // Catch: Throwable -> L42
        r26.close();
        r1.add(r30);
        long r31 = 12 + ((long) (r1.size() * 16));
        fh0.z(r19, r1.size(), 4);
        int r32 = 0;
    L63:
        if (r32 >= r1.size()) goto L85;
        ce5 r33 = (ce5) r1.get(r32);
        int r34 = r33.a;
        byte[] r35 = r33.b;
        if (r34 == 1) goto L78;
        int r124 = r23;
        if (r34 == r124) goto L77;
        if (r34 == 3) goto L76;
        if (r34 != 4) goto L71;
        long r125 = 3;
    L79:
        fh0.z(r19, r125, 4);
        fh0.z(r19, r31, 4);
        if (r33.c == false) goto L83;
        long r126 = r35.length;
        byte[] r36 = fh0.h(r35);
        r6.add(r36);
        fh0.z(r19, r36.length, 4);
        fh0.z(r19, r126, 4);
        int r37 = r36.length;
    L82:
        r31 = r31 + ((long) r37);
        r32 = r32 + 1;
        r23 = r124;
        goto L63
    L83:
        r6.add(r35);
        fh0.z(r19, r35.length, 4);
        fh0.z(r19, 0, 4);
        r37 = r35.length;
        goto L82
    L71:
        if (r34 != 5) goto L74;
        r125 = 4;
        goto L79
    L74:
        throw null;
    L76:
        r125 = 2;
        goto L79
    L77:
        r125 = 1;
        goto L79
    L78:
        r124 = r23;
        r125 = 0;
        goto L79
    L85:
        int r38 = 0;
    L87:
        if (r38 >= r6.size()) goto L89;
        r19.write((byte[]) r6.get(r38));
        r38 = r38 + 1;
        goto L87
    L89:
        return true;
    L91:
        throw new IllegalStateException("Expected size " + r28 + ", does not match actual size " + r2.length);     // Catch: Throwable -> L42
    L98:
        throw new IllegalStateException("Expected size " + r110 + ", does not match actual size " + r24.length);     // Catch: Throwable -> L24
    L105:
        throw new IllegalStateException("Expected size " + r12 + ", does not match actual size " + r9.length);     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        r7.close();     // Catch: Throwable -> L108
        throw th;
    L108:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L111:
        byte[] r39 = au0.y;
        if (Arrays.equals(r20, r39) == false) goto L116;
        byte[] r40 = p(r21, r39);
        fh0.z(r19, r21.length, 1);
        fh0.z(r19, r40.length, 4);
        byte[] r41 = fh0.h(r40);
        fh0.z(r19, r41.length, 4);
        r19.write(r41);
        return true;
    L116:
        if (Arrays.equals(r20, r4) == false) goto L127;
        fh0.z(r19, r21.length, 1);
        int r42 = r21.length;
        int r43 = 0;
    L118:
        if (r43 >= r42) goto L182;
        jp0 r44 = r21[r43];
        int r45 = r44.i.size() * 4;
        String r46 = w(r4, r44.a, r44.b);
        Charset r47 = StandardCharsets.UTF_8;
        fh0.A(r19, r46.getBytes(r47).length);
        fh0.A(r19, r44.h.length);
        fh0.z(r19, r45, 4);
        fh0.z(r19, r44.c, 4);
        r19.write(r46.getBytes(r47));
        Iterator r48 = r44.i.keySet().iterator();
    L121:
        if (r48.hasNext() == false) goto L123;
        fh0.A(r19, ((Integer) r48.next()).intValue());
        fh0.A(r19, 0);
        goto L121
    L123:
        int[] r49 = r44.h;
        int r50 = r49.length;
        int r51 = 0;
    L124:
        if (r51 >= r50) goto L126;
        fh0.A(r19, r49[r51]);
        r51 = r51 + 1;
        goto L124
    L126:
        r43 = r43 + 1;
        goto L118
    L182:
        return true;
    L127:
        byte[] r52 = au0.z;
        if (Arrays.equals(r20, r52) == false) goto L132;
        byte[] r53 = p(r21, r52);
        fh0.z(r19, r21.length, 1);
        fh0.z(r19, r53.length, 4);
        byte[] r54 = fh0.h(r53);
        fh0.z(r19, r54.length, 4);
        r19.write(r54);
        return true;
    L132:
        if (Arrays.equals(r20, r3) == false) goto L144;
        fh0.A(r19, r21.length);
        int r55 = r21.length;
        int r56 = 0;
    L134:
        if (r56 >= r55) goto L183;
        jp0 r57 = r21[r56];
        String r58 = r57.a;
        TreeMap r59 = r57.i;
        String r60 = w(r3, r58, r57.b);
        Charset r61 = StandardCharsets.UTF_8;
        fh0.A(r19, r60.getBytes(r61).length);
        fh0.A(r19, r59.size());
        fh0.A(r19, r57.h.length);
        fh0.z(r19, r57.c, 4);
        r19.write(r60.getBytes(r61));
        Iterator r62 = r59.keySet().iterator();
    L137:
        if (r62.hasNext() == false) goto L139;
        fh0.A(r19, ((Integer) r62.next()).intValue());
        goto L137
    L139:
        int[] r63 = r57.h;
        int r64 = r63.length;
        int r65 = 0;
    L140:
        if (r65 >= r64) goto L142;
        fh0.A(r19, r63[r65]);
        r65 = r65 + 1;
        goto L140
    L142:
        r56 = r56 + 1;
        goto L134
    L183:
        return true;
    L144:
        return false;
    }

    public static final boolean T(Throwable r6, gf1 r7) {
        r6.getClass();
        Integer r0 = m22.a;
        DiagnosticComposeException r1 = null;
        if (r0 != null) goto L5;
    L13:
        Throwable[] r2 = r6.getSuppressed();
        r2.getClass();
        List r3 = Arrays.asList(r2);
        r3.getClass();
    L14:
        int r4 = r3.size();
        boolean r5 = false;
        int r8 = 0;
    L15:
        if (r8 < r4) goto L17;
        c80 r9 = (c80) r7.invoke();     // Catch: Throwable -> L28
        if (r9 == null) goto L33;
        boolean r10 = r9.b;     // Catch: Throwable -> L28
        List r11 = r9.a;
        if (r10 == false) goto L31;
        int r12 = r11.size();     // Catch: Throwable -> L28
        int r13 = 0;
    L26:
        if (r13 >= r12) goto L33;
        ((d80) r11.get(r13)).getClass();     // Catch: Throwable -> L28
        r13 = r13 + 1;     // Catch: Throwable -> L28
        goto L26
    L31:
        if (r11.isEmpty() == true) goto L33;
        r5 = true;
    L33:
        if (r5 == false) goto L37;
        r9.getClass();     // Catch: Throwable -> L28
        r1 = new DiagnosticComposeException(r9);     // Catch: Throwable -> L28
    L37:
        if (r1 == null) goto L39;
        j51.d(r6, r1);
    L39:
        return r5;
    L28:
        th = move-exception;
        r1 = th;
        goto L37
    L17:
        if ((((Throwable) r3.get(r8)) instanceof DiagnosticComposeException) == true) goto L18;
        r8 = r8 + 1;
        goto L15
    L18:
        return false;
    L5:
        if (r0.intValue() >= 19) goto L13;
        Method r14 = tg3.b;
        if (r14 == null) goto L12;
        Object r15 = r14.invoke(r6, null);
        if (r15 == null) goto L12;
        r3 = Arrays.asList((Throwable[]) r15);
        r3.getClass();
    L12:
        r3 = u01.n;
        goto L14
    }

    public static Set U(tl1 r7) {
        int r0 = r7.size();
        TreeSet r1 = null;
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L15;
        if ("Vary".equalsIgnoreCase(r7.b(r3)) == false) goto L14;
        String r4 = r7.e(r3);
        if (r1 != null) goto L10;
        Comparator r5 = String.CASE_INSENSITIVE_ORDER;
        r5.getClass();
        r1 = new TreeSet(r5);
    L10:
        Iterator r6 = qm4.D0(r4, new char[]{','}).iterator();
    L12:
        if (r6.hasNext() == false) goto L14;
        r1.add(qm4.K0((String) r6.next()).toString());
    L14:
        r3 = r3 + 1;
        goto L3
    L15:
        if (r1 == null) goto L17;
        return r1;
    L17:
        return z01.n;
    }

    public static void V(ByteArrayOutputStream r8, jp0 r9) {
        Y(r8, r9);
        int r0 = r9.g;
        int[] r1 = r9.h;
        int r2 = r1.length;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r2) goto L5;
        int r5 = r1[r3];
        fh0.A(r8, r5 - r4);
        r3 = r3 + 1;
        r4 = r5;
        goto L3
    L5:
        byte[] r6 = new byte[(((r0 * 2) + 7) & (-8)) / 8];
        Iterator r10 = r9.i.entrySet().iterator();
    L7:
        if (r10.hasNext() == false) goto L14;
        Map.Entry r7 = (Map.Entry) r10.next();
        int r11 = ((Integer) r7.getKey()).intValue();
        int r12 = ((Integer) r7.getValue()).intValue();
        if ((r12 & 2) == 0) goto L12;
        int r13 = r11 / 8;
        r6[r13] = (byte) (r6[r13] | (1 << (r11 % 8)));
    L12:
        if ((r12 & 4) == 0) goto L7;
        int r14 = r11 + r0;
        int r15 = r14 / 8;
        r6[r15] = (byte) ((1 << (r14 % 8)) | r6[r15]);
        goto L7
    L14:
        r8.write(r6);
    }

    public static void W(ByteArrayOutputStream r4, jp0 r5, String r6) {
        Charset r0 = StandardCharsets.UTF_8;
        fh0.A(r4, r6.getBytes(r0).length);
        fh0.A(r4, r5.e);
        fh0.z(r4, r5.f, 4);
        fh0.z(r4, r5.c, 4);
        fh0.z(r4, r5.g, 4);
        r4.write(r6.getBytes(r0));
    }

    public static void X(ByteArrayOutputStream r10, int r11, jp0 r12) {
        int r0 = r12.g;
        byte[] r1 = new byte[(((Integer.bitCount(r11 & (-2)) * r0) + 7) & (-8)) / 8];
        Iterator r13 = r12.i.entrySet().iterator();
    L4:
        if (r13.hasNext() == false) goto L17;
        Map.Entry r2 = (Map.Entry) r13.next();
        int r3 = ((Integer) r2.getKey()).intValue();
        int r4 = ((Integer) r2.getValue()).intValue();
        int r5 = 0;
        int r6 = 1;
    L7:
        if (r6 > 4) goto L4;
        if (r6 == 1) goto L9;
        if ((r6 & r11) == 0) goto L9;
        if ((r6 & r4) != r6) goto L16;
        int r7 = (r5 * r0) + r3;
        int r8 = r7 / 8;
        r1[r8] = (byte) ((1 << (r7 % 8)) | r1[r8]);
    L16:
        r5 = r5 + 1;
    L9:
        r6 = r6 << 1;
        goto L7
    L17:
        r10.write(r1);
    }

    public static void Y(ByteArrayOutputStream r4, jp0 r5) {
        Iterator r6 = r5.i.entrySet().iterator();
        int r1 = 0;
    L4:
        if (r6.hasNext() == false) goto L9;
        Map.Entry r2 = (Map.Entry) r6.next();
        int r3 = ((Integer) r2.getKey()).intValue();
        if ((((Integer) r2.getValue()).intValue() & 1) == 0) goto L4;
        fh0.A(r4, r3 - r1);
        fh0.A(r4, 0);
        r1 = r3;
        goto L4
    }

    public static final void Z(Bundle r3, ReplayGainInfo r4) {
        if (r4 != null) goto L5;
    L32:
        r3.putBoolean("rg_present", false);
        return;
    L5:
        if (r4.hasAnyValue() == false) goto L32;
        r3.putBoolean("rg_present", true);
        Float r0 = r4.getTrackGain();
        float r1 = Float.NaN;
        if (r0 == null) goto L10;
        float r2 = r0.floatValue();
    L11:
        r3.putFloat("rg_trackGain", r2);
        Float r5 = r4.getAlbumGain();
        if (r5 == null) goto L14;
        float r6 = r5.floatValue();
    L15:
        r3.putFloat("rg_albumGain", r6);
        Float r7 = r4.getTrackPeak();
        if (r7 == null) goto L18;
        float r8 = r7.floatValue();
    L19:
        r3.putFloat("rg_trackPeak", r8);
        Float r9 = r4.getAlbumPeak();
        if (r9 == null) goto L22;
        float r10 = r9.floatValue();
    L23:
        r3.putFloat("rg_albumPeak", r10);
        Float r11 = r4.getBaseGain();
        if (r11 == null) goto L26;
        float r12 = r11.floatValue();
    L27:
        r3.putFloat("rg_baseGain", r12);
        Float r13 = r4.getFallbackGain();
        if (r13 == null) goto L30;
        r1 = r13.floatValue();
    L30:
        r3.putFloat("rg_fallbackGain", r1);
        return;
    L26:
        r12 = Float.NaN;
        goto L27
    L22:
        r10 = Float.NaN;
        goto L23
    L18:
        r8 = Float.NaN;
        goto L19
    L14:
        r6 = Float.NaN;
        goto L15
    L10:
        r2 = Float.NaN;
        goto L11
    }

    public static boolean a0(Comparator r1, Collection r2) {
        r1.getClass();
        r2.getClass();
        if ((r2 instanceof SortedSet) == false) goto L8;
        Object r3 = ((SortedSet) r2).comparator();
        if (r3 != null) goto L11;
        r3 = ni5.o;
    L11:
        return r1.equals(r3);
    L8:
        if ((r2 instanceof ki5) == false) goto L12;
        r3 = ((ki5) r2).q;
        goto L11
    L12:
        return false;
    }

    public static Object d(Parcel r1, Parcelable.Creator r2) {
        if (r1.readInt() != 0) goto L5;
        return null;
    L5:
        return r2.createFromParcel(r1);
    }

    public static void e(Parcel r2, Parcelable r3) {
        if (r3 == null) goto L6;
        r2.writeInt(1);
        r3.writeToParcel(r2, 0);
        return;
    L6:
        r2.writeInt(0);
    }

    public static final Object[] f(Object[] r3, int r4, Object r5, Object r6) {
        Object[] r0 = new Object[r3.length + 2];
        ti.c0(0, r4, 6, r3, r0);
        ti.Z(r4 + 2, r4, r3.length, r3, r0);
        r0[r4] = r5;
        r0[r4 + 1] = r6;
        return r0;
    }

    public static final Object[] g(int r3, Object[] r4) {
        Object[] r0 = new Object[r4.length - 2];
        ti.c0(0, r3, 6, r4, r0);
        ti.Z(r3, r3 + 2, r4.length, r4, r0);
        return r0;
    }

    public static final Object[] h(int r3, Object[] r4) {
        Object[] r0 = new Object[r4.length - 1];
        ti.c0(0, r3, 6, r4, r0);
        ti.Z(r3, r3 + 1, r4.length, r4, r0);
        return r0;
    }

    public static final void i(int r1, int r2, List r3) {
        int r4 = t(r3, r1);
        if (r4 >= 0) goto L6;
        r4 = -(r4 + 1);
    L6:
        if (r4 >= r3.size()) goto L10;
        if (((o12) r3.get(r4)).b >= r2) goto L14;
        o12 r0 = (o12) r3.remove(r4);
        goto L6
    L14:
        return;
    }

    public static void j(StringBuilder r0, Object r1, if1 r2) {
        if (r2 == null) goto L5;
        r0.append((CharSequence) r2.invoke(r1));
        return;
    L5:
        if (r1 != null) goto L7;
        boolean r3 = true;
    L8:
        if (r3 == false) goto L12;
        r0.append((CharSequence) r1);
        return;
    L12:
        if ((r1 instanceof Character) == false) goto L15;
        r0.append(((Character) r1).charValue());
        return;
    L15:
        r0.append(r1.toString());
        return;
    L7:
        r3 = r1 instanceof CharSequence;
        goto L8
    }

    public static int l(Context r6, String r7) {
        int r0 = Process.myPid();
        int r1 = Process.myUid();
        String r2 = r6.getPackageName();
        if (r6.checkPermission(r7, r0, r1) == (-1)) goto L15;
        String r8 = AppOpsManager.permissionToOp(r7);
        if (r8 == null) goto L36;
        if (r2 != null) goto L16;
        String[] r3 = r6.getPackageManager().getPackagesForUid(r1);
        if (r3 == null) goto L15;
        if (r3.length <= 0) goto L15;
        r2 = r3[0];
    L16:
        int r4 = Process.myUid();
        String r5 = r6.getPackageName();
        if (r4 == r1) goto L19;
    L34:
        int r9 = ((AppOpsManager) r6.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(r8, r2);
    L35:
        if (r9 == 0) goto L36;
        return -2;
    L19:
        if (Objects.equals(r5, r2) == false) goto L34;
        if (Build.VERSION.SDK_INT < 29) goto L33;
        AppOpsManager r10 = (AppOpsManager) r6.getSystemService(AppOpsManager.class);
        int r11 = Binder.getCallingUid();
        int r12 = 1;
        if (r10 != null) goto L25;
        r9 = 1;
    L26:
        if (r9 != 0) goto L35;
        String r13 = yh.b(r6);
        if (r10 == null) goto L32;
        r12 = r10.checkOpNoThrow(r8, r1, r13);
    L32:
        r9 = r12;
        goto L35
    L25:
        r9 = r10.checkOpNoThrow(r8, r11, r2);
        goto L26
    L33:
        r9 = ((AppOpsManager) r6.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(r8, r2);
    L36:
        return 0;
    L15:
        return -1;
    }

    public static final void m(hg4 r3, ArrayList r4, int r5) {
        boolean r0 = r3.l(r5);
        int[] r1 = r3.b;
        if (r0 == false) goto L6;
        r4.add(r3.n(r5));
        return;
    L6:
        int r2 = r5 + 1;
        int r6 = r1[(r5 * 5) + 3] + r5;
    L7:
        if (r2 >= r6) goto L9;
        m(r3, r4, r2);
        r2 = r2 + r1[(r2 * 5) + 3];
        goto L7
    }

    public static long[] n(long[]... r7) {
        int r0 = r7.length;
        long r1 = 0;
        int r4 = 0;
    L3:
        if (r4 >= r0) goto L5;
        r1 = r1 + ((long) r7[r4].length);
        r4 = r4 + 1;
        goto L3
    L5:
        int r2 = (int) r1;
        if (r1 != r2) goto L8;
        boolean r5 = true;
    L9:
        rr2.m(r5, "the total number of elements (%s) in the arrays must fit in an int", r1);
        long[] r3 = new long[r2];
        int r6 = r7.length;
        int r8 = 0;
        int r9 = 0;
    L10:
        if (r8 >= r6) goto L12;
        long[] r10 = r7[r8];
        System.arraycopy(r10, 0, r3, r9, r10.length);
        r9 = r9 + r10.length;
        r8 = r8 + 1;
        goto L10
    L12:
        return r3;
    L8:
        r5 = false;
        goto L9
    }

    public static sa1 o(Context r13) {
        int r2 = 26;
        if (Build.VERSION.SDK_INT < 28) goto L5;
        i80 r0 = new nk0(r2);
    L6:
        PackageManager r1 = r13.getPackageManager();
        l93.m(r1, "Package manager required to locate emoji font provider");
        int r3 = 0;
        Iterator<ResolveInfo> r4 = r1.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
    L8:
        if (r4.hasNext() == false) goto L16;
        ProviderInfo r5 = r4.next().providerInfo;
        if (r5 == null) goto L8;
        ApplicationInfo r6 = r5.applicationInfo;
        if (r6 == null) goto L8;
        if ((r6.flags & 1) != 1) goto L8;
    L17:
        if (r5 != null) goto L30;
    L18:
        pa1 r7 = null;
    L26:
        if (r7 != null) goto L29;
        return null;
    L29:
        return new sa1(new ra1(r13, r7));
    L30:
        String r8 = r5.authority;     // Catch: PackageManager.NameNotFoundException -> L24
        String r9 = r5.packageName;     // Catch: PackageManager.NameNotFoundException -> L24
        Signature[] r10 = r0.F(r1, r9);     // Catch: PackageManager.NameNotFoundException -> L24
        ArrayList r11 = new ArrayList();     // Catch: PackageManager.NameNotFoundException -> L24
        int r12 = r10.length;     // Catch: PackageManager.NameNotFoundException -> L24
    L20:
        if (r3 >= r12) goto L22;
        r11.add(r10[r3].toByteArray());     // Catch: PackageManager.NameNotFoundException -> L24
        r3 = r3 + 1;     // Catch: PackageManager.NameNotFoundException -> L24
        goto L20
    L22:
        r7 = new pa1(r8, Collections.singletonList(r11), r9, "emojicompat-emoji-font", null, null);     // Catch: PackageManager.NameNotFoundException -> L24
    L24:
        e = move-exception;
        Log.wtf("emoji2.text.DefaultEmojiConfig", e);
        goto L18
    L16:
        r5 = null;
        goto L17
    L5:
        r0 = new i80(r2);
        goto L6
    }

    public static byte[] p(jp0[] r8, byte[] r9) {
        int r0 = r8.length;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r0) goto L5;
        jp0 r4 = r8[r2];
        r3 = r3 + (((((r4.g * 2) + 7) & (-8)) / 8) + (((r4.e * 2) + (w(r9, r4.a, r4.b).getBytes(StandardCharsets.UTF_8).length + 16)) + r4.f));
        r2 = r2 + 1;
        goto L3
    L5:
        ByteArrayOutputStream r5 = new ByteArrayOutputStream(r3);
        if (Arrays.equals(r9, au0.z) == false) goto L10;
        int r6 = r8.length;
    L8:
        if (r1 >= r6) goto L17;
        jp0 r7 = r8[r1];
        W(r5, r7, w(r9, r7.a, r7.b));
        V(r5, r7);
        r1 = r1 + 1;
    L17:
        if (r5.size() == r3) goto L19;
        nz2.d(r5.size(), r3, " expected=", "The bytes saved do not match expectation. actual=");
        return null;
    L19:
        return r5.toByteArray();
    L10:
        int r10 = r8.length;
        int r11 = 0;
    L11:
        if (r11 >= r10) goto L13;
        jp0 r12 = r8[r11];
        W(r5, r12, w(r9, r12.a, r12.b));
        r11 = r11 + 1;
        goto L11
    L13:
        int r13 = r8.length;
    L14:
        if (r1 >= r13) goto L17;
        V(r5, r8[r1]);
        r1 = r1 + 1;
        goto L14
    }

    public static GetCredentialException q(String r4, String r5) {
        r4.getClass();
        GetPublicKeyCredentialDomException r0 = new GetPublicKeyCredentialDomException(new h(26), null);     // Catch: FrameworkClassParsingException -> L94
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR") == false) goto L7;
        Exception r1 = ji2.c(new h(0), r5, r0);     // Catch: FrameworkClassParsingException -> L94
    L91:
        return (GetCredentialException) r1;
    L7:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR") == false) goto L10;
        r1 = ji2.c(new h(1), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L10:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR") == false) goto L13;
        r1 = ji2.c(new h("androidx.credentials.TYPE_DATA_CLONE_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L13:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR") == false) goto L16;
        r1 = ji2.c(new h(3), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L16:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR") == false) goto L19;
        r1 = ji2.c(new h(4), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L19:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR") == false) goto L22;
        r1 = ji2.c(new h("androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L22:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR") == false) goto L25;
        r1 = ji2.c(new h("androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L25:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR") == false) goto L28;
        r1 = ji2.c(new h("androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L28:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR") == false) goto L31;
        r1 = ji2.c(new h("androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L31:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR") == false) goto L34;
        r1 = ji2.c(new h("androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L34:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR") == false) goto L37;
        r1 = ji2.c(new h(10), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L37:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR") == false) goto L40;
        r1 = ji2.c(new h("androidx.credentials.TYPE_NAMESPACE_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L40:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR") == false) goto L43;
        r1 = ji2.c(new h(12), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L43:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR") == false) goto L46;
        r1 = ji2.c(new h("androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L46:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR") == false) goto L49;
        r1 = ji2.c(new h(14), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L49:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR") == false) goto L52;
        r1 = ji2.c(new h("androidx.credentials.TYPE_NOT_FOUND_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L52:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR") == false) goto L55;
        r1 = ji2.c(new h(16), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L55:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR") == false) goto L58;
        r1 = ji2.c(new h(17), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L58:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR") == false) goto L61;
        r1 = ji2.c(new h("androidx.credentials.TYPE_OPERATION_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L61:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR") == false) goto L64;
        r1 = ji2.c(new h("androidx.credentials.TYPE_OPT_OUT_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L64:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR") == false) goto L67;
        r1 = ji2.c(new h("androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L67:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR") == false) goto L70;
        r1 = ji2.c(new h("androidx.credentials.TYPE_READ_ONLY_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L70:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR") == false) goto L73;
        r1 = ji2.c(new h(22), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L73:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR") == false) goto L76;
        r1 = ji2.c(new h("androidx.credentials.TYPE_SYNTAX_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L76:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR") == false) goto L79;
        r1 = ji2.c(new h(24), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L79:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR") == false) goto L82;
        r1 = ji2.c(new h("androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L82:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR") == false) goto L85;
        r1 = ji2.c(new h(26), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L85:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR") == false) goto L88;
        r1 = ji2.c(new h("androidx.credentials.TYPE_VERSION_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L88:
        if (r4.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR") == false) goto L93;
        r1 = ji2.c(new h("androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"), r5, r0);     // Catch: FrameworkClassParsingException -> L94
        goto L91
    L93:
        throw new FrameworkClassParsingException();     // Catch: FrameworkClassParsingException -> L94
    L95:
        return new GetCredentialCustomException(r5, r4);
    }

    public static boolean s(Object r0, Object r1) {
        if (r0 == r1) goto L9;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.equals(r1) == true) goto L12;
        return false;
    L12:
        return true;
    L9:
        return true;
    }

    public static final int t(List r4, int r5) {
        int r0 = r4.size() - 1;
        int r1 = 0;
    L3:
        if (r1 > r0) goto L11;
        int r2 = (r1 + r0) >>> 1;
        int r3 = h12.j(((o12) r4.get(r2)).b, r5);
        if (r3 < 0) goto L6;
        if (r3 <= 0) goto L9;
        r0 = r2 - 1;
        goto L3
    L9:
        return r2;
    L6:
        r1 = r2 + 1;
        goto L3
    L11:
        return -(r1 + 1);
    }

    public static final List u(pz1 r9, int r10, int r11) {
        r9.getClass();
        if (r10 != r11) goto L7;
        return u01.n;
    L7:
        if (r11 <= r10) goto L9;
        boolean r2 = true;
    L10:
        ArrayList r3 = new ArrayList();
    L11:
        if (r2 == false) goto L14;
        if (r10 >= r11) goto L42;
    L15:
        LinkedHashMap r4 = (LinkedHashMap) r9.o;
        if (r2 == false) goto L21;
        TreeMap r5 = (TreeMap) r4.get(Integer.valueOf(r10));
        if (r5 != null) goto L20;
    L19:
        kd3 r7 = null;
    L25:
        if (r7 == null) goto L41;
        Map r6 = (Map) r7.n;
        Iterator r8 = ((Iterable) r7.o).iterator();
    L29:
        if (r8.hasNext() == false) goto L39;
        int r12 = ((Number) r8.next()).intValue();
        if (r2 == true) goto L33;
        if (r11 > r12) goto L29;
        if (r12 >= r10) goto L29;
    L38:
        Object r13 = r6.get(Integer.valueOf(r12));
        r13.getClass();
        r3.add(r13);
        boolean r14 = true;
        r10 = r12;
    L40:
        if (r14 == true) goto L11;
    L33:
        if ((r10 + 1) > r12) goto L29;
        if (r12 > r11) goto L29;
    L39:
        r14 = false;
    L41:
        return null;
    L20:
        r7 = new kd3(r5, r5.descendingKeySet());
        goto L25
    L21:
        TreeMap r15 = (TreeMap) r4.get(Integer.valueOf(r10));
        if (r15 == null) goto L19;
        r7 = new kd3(r15, r15.keySet());
    L42:
        return r3;
    L14:
        if (r10 <= r11) goto L42;
    L9:
        r2 = false;
        goto L10
    }

    public static final ReplayGainInfo v(Bundle r8) {
        if (r8 != null) goto L4;
        return null;
    L4:
        if (r8.getBoolean("rg_present", false) == true) goto L7;
        return null;
    L7:
        return new ReplayGainInfo(Q(r8.getFloat("rg_trackGain", Float.NaN)), Q(r8.getFloat("rg_albumGain", Float.NaN)), Q(r8.getFloat("rg_trackPeak", Float.NaN)), Q(r8.getFloat("rg_albumPeak", Float.NaN)), Q(r8.getFloat("rg_baseGain", Float.NaN)), Q(r8.getFloat("rg_fallbackGain", Float.NaN)));
    }

    public static String w(byte[] r6, String r7, String r8) {
        byte[] r0 = au0.A;
        byte[] r1 = au0.B;
        String r3 = "!";
        if (Arrays.equals(r6, r1) == false) goto L6;
    L7:
        Object r2 = ":";
    L10:
        if (r7.length() > 0) goto L20;
        if ("!".equals(r2) == false) goto L16;
        return r8.replace(":", "!");
    L16:
        if (":".equals(r2) == true) goto L18;
    L46:
        return r8;
    L18:
        return r8.replace("!", ":");
    L20:
        if (r8.equals("classes.dex") == false) goto L23;
        return r7;
    L23:
        if (r8.contains("!") == true) goto L39;
        if (r8.contains(":") == true) goto L39;
        if (r8.endsWith(".apk") == true) goto L46;
        StringBuilder r9 = xa3.i(r7);
        if (Arrays.equals(r6, r1) == false) goto L34;
    L35:
        r3 = ":";
    L37:
        return b11.q(r9, r3, r8);
    L34:
        if (Arrays.equals(r6, r0) == false) goto L37;
    L39:
        if ("!".equals(r2) == false) goto L43;
        return r8.replace(":", "!");
    L43:
        if (":".equals(r2) == false) goto L46;
        return r8.replace("!", ":");
    L6:
        if (Arrays.equals(r6, r0) == true) goto L7;
        r2 = "!";
        goto L10
    }

    public static final String x(Object r0) {
        return Integer.toHexString(System.identityHashCode(r0));
    }

    public static int z(long r2) {
        return (int) (r2 ^ (r2 >>> 32));
    }

    @Override // defpackage.u75
    public void a() {
    }

    @Override // defpackage.u75
    public void b() {
    }

    public abstract void k(z34 r1, Object r2);

    public abstract String r();

    public void y(x34 r2, Object r3) {
        r2.getClass();
        if (r3 != null) goto L5;
        return;
    L5:
        z34 r0 = r2.U(r());
        k(r0, r3);     // Catch: Throwable -> L9
        r0.O();     // Catch: Throwable -> L9
        ud3.e(r0, null);
        ji2.x(r2);
        return;
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        ud3.e(r0, th);
        throw th;
    }
}
