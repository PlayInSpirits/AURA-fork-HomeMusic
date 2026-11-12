package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
@s43("activity")
public class l5 extends t43 {
    public final Context c;
    public final Activity d;

    public l5(Context r3) {
        this.c = r3;
        Iterator r4 = fa4.c0(k5.o, r3).iterator();
    L4:
        if (r4.hasNext() == false) goto L8;
        Object r0 = r4.next();
        if ((((Context) r0) instanceof Activity) == false) goto L4;
    L9:
        this.d = (Activity) r0;
        return;
    L8:
        r0 = null;
        goto L9
    }

    @Override // defpackage.t43
    public final r23 a() {
        return new j5(this);
    }

    @Override // defpackage.t43
    public final r23 c(r23 r11, Bundle r12, y23 r13) {
        j5 r14 = (j5) r11;
        if (r14.x == null) goto L73;
        Intent r0 = new Intent(r14.x);
        if (r12 == null) goto L27;
        r0.putExtras(r12);
        String r8 = r14.y;
        if (r8 == null) goto L27;
        if (r8.length() == 0) goto L27;
        StringBuffer r2 = new StringBuffer();
        Matcher r3 = Pattern.compile("\\{(.+?)\\}").matcher(r8);
    L13:
        if (r3.find() == false) goto L26;
        String r4 = r3.group(1);
        if (r12.containsKey(r4) == false) goto L24;
        r3.appendReplacement(r2, "");
        Map r5 = lg2.a0(r14.t);
        r4.getClass();
        z13 r6 = (z13) r5.get(r4);
        if (r6 == null) goto L19;
        h33 r7 = r6.a;
    L20:
        if (r7 == null) goto L22;
        String r9 = r7.f(r7.a(r4, r12));
    L23:
        r2.append(r9);
        goto L13
    L22:
        r9 = Uri.encode(String.valueOf(r12.get(r4)));
        goto L23
    L19:
        r7 = null;
        goto L20
    L24:
        nz2.q("Could not find ", r4, " in ", r12, " to fill data pattern ", r8);
        return null;
    L26:
        r3.appendTail(r2);
        r0.setData(Uri.parse(r2.toString()));
    L27:
        Activity r15 = this.d;
        if (r15 != null) goto L30;
        r0.addFlags(268435456);
    L30:
        if (r13 != null) goto L32;
    L34:
        int r10 = 0;
        if (r15 == null) goto L41;
        Intent r16 = r15.getIntent();
        if (r16 == null) goto L41;
        int r17 = r16.getIntExtra("android-support-navigation:ActivityNavigator:current", 0);
        if (r17 == 0) goto L41;
        r0.putExtra("android-support-navigation:ActivityNavigator:source", r17);
    L41:
        r0.putExtra("android-support-navigation:ActivityNavigator:current", r14.u);
        Context r18 = this.c;
        Resources r19 = r18.getResources();
        if (r13 == null) goto L52;
        int r20 = r13.h;
        int r21 = r13.i;
        if (r20 > 0) goto L46;
    L47:
        if (r21 > 0) goto L49;
    L51:
        r0.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", r20);
        r0.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", r21);
        goto L52
    L49:
        if (h12.c(r19.getResourceTypeName(r21), "animator") == false) goto L51;
    L50:
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + r19.getResourceName(r20) + " and popExit resource " + r19.getResourceName(r21) + " when launching " + r14);
        goto L52
    L46:
        if (h12.c(r19.getResourceTypeName(r20), "animator") == true) goto L50;
    L52:
        r18.startActivity(r0);
        if (r13 == null) goto L72;
        if (r15 == null) goto L72;
        int r110 = r13.f;
        int r111 = r13.g;
        if (r110 > 0) goto L58;
    L59:
        if (r111 > 0) goto L61;
    L64:
        if (r110 >= 0) goto L66;
        if (r111 < 0) goto L72;
    L66:
        if (r110 >= 0) goto L68;
        r110 = 0;
    L68:
        if (r111 < 0) goto L71;
        r10 = r111;
    L71:
        r15.overridePendingTransition(r110, r10);
        goto L72
    L61:
        if (h12.c(r19.getResourceTypeName(r111), "animator") == false) goto L64;
    L62:
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + r19.getResourceName(r110) + " and exit resource " + r19.getResourceName(r111) + "when launching " + r14);
        return null;
    L58:
        if (h12.c(r19.getResourceTypeName(r110), "animator") == true) goto L62;
    L72:
        return null;
    L32:
        if (r13.a == false) goto L34;
        r0.addFlags(536870912);
        goto L34
    L73:
        nz2.f(f34.i(new StringBuilder("Destination "), r14.u, " does not have an Intent set."));
        return null;
    }

    @Override // defpackage.t43
    public final boolean j() {
        Activity r0 = this.d;
        if (r0 == null) goto L6;
        r0.finish();
        return true;
    L6:
        return false;
    }
}
