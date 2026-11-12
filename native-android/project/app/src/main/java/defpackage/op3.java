package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class op3 {
    public static final Class[] e = null;
    public static final HashMap f = null;
    public final Context a;
    public final Object[] b;
    public final pp3 c;
    public final String[] d;

    static {
        e = new Class[]{Context.class, AttributeSet.class};
        f = new HashMap();
    }

    public op3(Context r3, pp3 r4) {
        this.b = new Object[2];
        this.a = r3;
        this.c = r4;
        this.d = new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};
    }

    public final Preference a(String r12, String[] r13, AttributeSet r14) {
        HashMap r0 = f;
        Constructor<?> r1 = (Constructor) r0.get(r12);
        if (r1 == null) goto L31;
    L25:
        Object[] r11 = this.b;     // Catch: Exception -> L14 ClassNotFoundException -> L29
        r11[1] = r14;     // Catch: Exception -> L14 ClassNotFoundException -> L29
        return (Preference) r1.newInstance(r11);
    L31:
        ClassLoader r2 = this.a.getClassLoader();     // Catch: Exception -> L14 ClassNotFoundException -> L29
        if (r13 != null) goto L7;
    L23:
        Class<?> r6 = Class.forName(r12, false, r2);     // Catch: Exception -> L14 ClassNotFoundException -> L29
    L24:
        r1 = r6.getConstructor(e);     // Catch: Exception -> L14 ClassNotFoundException -> L29
        r1.setAccessible(true);     // Catch: Exception -> L14 ClassNotFoundException -> L29
        r0.put(r12, r1);     // Catch: Exception -> L14 ClassNotFoundException -> L29
        goto L25
    L7:
        if (r13.length == 0) goto L23;
        int r5 = r13.length;     // Catch: Exception -> L14 ClassNotFoundException -> L29
        r6 = null;
        int r7 = 0;
        ClassNotFoundException e2 = null;
    L10:
        if (r7 >= r5) goto L18;
        r6 = Class.forName(r13[r7] + r12, false, r2);     // Catch: Exception -> L14 ClassNotFoundException -> L16
    L16:
        e2 = e;
        r7 = r7 + 1;
    L18:
        if (r6 != null) goto L24;
        if (e2 == null) goto L21;
        throw e2;     // Catch: Exception -> L14 ClassNotFoundException -> L29
    L21:
        throw new InflateException(r14.getPositionDescription() + ": Error inflating class " + r12);     // Catch: Exception -> L14 ClassNotFoundException -> L29
    L29:
        e = move-exception;
        throw e;
    L14:
        e = move-exception;
        InflateException r15 = new InflateException(r14.getPositionDescription() + ": Error inflating class " + r12);
        r15.initCause(e);
        throw r15;
    }

    public final Preference b(String r3, AttributeSet r4) {
    L17:
        e = move-exception;
        throw e;
    L11:
        e = move-exception;
        InflateException r0 = new InflateException(r4.getPositionDescription() + ": Error inflating class (not found)" + r3);
        r0.initCause(e);
        throw r0;
    L9:
        e = move-exception;
        InflateException r1 = new InflateException(r4.getPositionDescription() + ": Error inflating class " + r3);
        r1.initCause(e);
        throw r1;
    L4:
        if ((-1) != r3.indexOf(46)) goto L8;
        return a(r3, this.d, r4);
    L8:
        return a(r3, null, r4);
    }

    public final PreferenceGroup c(XmlResourceParser r6) {
        Object[] r0 = this.b;
        monitor-enter(r0);
        AttributeSet r1 = Xml.asAttributeSet(r6);     // Catch: Throwable -> L13
        this.b[0] = this.a;     // Catch: Throwable -> L13
    L31:
        int r2 = r6.next();     // Catch: Throwable -> L13 IOException -> L15 XmlPullParserException -> L17 InflateException -> L19
        if (r2 == 2) goto L9;
        if (r2 != 1) goto L31;
    L9:
        if (r2 != 2) goto L22;
        PreferenceGroup r3 = (PreferenceGroup) b(r6.getName(), r1);     // Catch: Throwable -> L13 IOException -> L15 XmlPullParserException -> L17 InflateException -> L19
        r3.k(this.c);     // Catch: Throwable -> L13 IOException -> L15 XmlPullParserException -> L17 InflateException -> L19
        d(r6, r3, r1);     // Catch: Throwable -> L13 IOException -> L15 XmlPullParserException -> L17 InflateException -> L19
        monitor-exit(r0);     // Catch: Throwable -> L13
        return r3;
    L22:
        throw new InflateException(r6.getPositionDescription() + ": No start tag found!");     // Catch: Throwable -> L13 IOException -> L15 XmlPullParserException -> L17 InflateException -> L19
    L19:
        e = move-exception;
        throw e;     // Catch: Throwable -> L13
    L15:
        e = move-exception;
        InflateException r4 = new InflateException(r6.getPositionDescription() + ": " + e.getMessage());     // Catch: Throwable -> L13
        r4.initCause(e);     // Catch: Throwable -> L13
        throw r4;     // Catch: Throwable -> L13
    L17:
        e = move-exception;
        InflateException r7 = new InflateException(e.getMessage());     // Catch: Throwable -> L13
        r7.initCause(e);     // Catch: Throwable -> L13
        throw r7;     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        throw th;
    }

    public final void d(XmlPullParser r9, Preference r10, AttributeSet r11) {
        int r0 = r9.getDepth();
    L3:
        int r1 = r9.next();
        if (r1 != 3) goto L8;
        if (r9.getDepth() > r0) goto L8;
        return;
    L8:
        if (r1 == 1) goto L57;
        if (r1 != 2) goto L3;
        String r2 = r9.getName();
        boolean r4 = "intent".equals(r2);
        Context r6 = this.a;
        if (r4 == false) goto L20;
        r10.z = Intent.parseIntent(r6.getResources(), r9, r11);
    L16:
        e = move-exception;
        XmlPullParserException r12 = new XmlPullParserException("Error parsing preference");
        r12.initCause(e);
        throw r12;
    L20:
        if ("extra".equals(r2) == true) goto L21;
        Preference r3 = b(r2, r11);
        ((PreferenceGroup) r10).E(r3);
        d(r9, r3, r11);
        goto L3
    L21:
        Resources r5 = r6.getResources();
        if (r10.B != null) goto L24;
        r10.B = new Bundle();
    L24:
        r5.parseBundleExtra("extra", r11, r10.B);
        int r7 = r9.getDepth();     // Catch: IOException -> L32
    L26:
        int r8 = r9.next();     // Catch: IOException -> L32
        if (r8 == 1) goto L3;
        if (r8 != 3) goto L26;
        if (r9.getDepth() > r7) goto L26;
    L32:
        e = move-exception;
        XmlPullParserException r13 = new XmlPullParserException("Error parsing preference");
        r13.initCause(e);
        throw r13;
    }
}
