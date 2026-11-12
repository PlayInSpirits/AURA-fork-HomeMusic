package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
@s43("activity")
public class l5 extends t43 {
    public final Context c;
    public final Activity d;

    public l5(Context context) {
        this.c = context;
        for (Object obj : fa4.c0(k5.o, context)) {
            if (((Context) obj) instanceof Activity) {
                this.d = (Activity) obj;
            }
        }
        obj = null;
        this.d = (Activity) obj;
    }

    @Override // defpackage.t43
    public final r23 a() {
        return new j5(this);
    }

    @Override // defpackage.t43
    public final r23 c(r23 r23Var, Bundle bundle, y23 y23Var) {
        Intent intent;
        int intExtra;
        j5 j5Var = (j5) r23Var;
        if (j5Var.x == null) {
            nz2.f(f34.i(new StringBuilder("Destination "), j5Var.u, " does not have an Intent set."));
            return null;
        }
        Intent intent2 = new Intent(j5Var.x);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = j5Var.y;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        nz2.q("Could not find ", strGroup, " in ", bundle, " to fill data pattern ", str);
                        return null;
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    Map mapA0 = lg2.a0(j5Var.t);
                    strGroup.getClass();
                    z13 z13Var = (z13) mapA0.get(strGroup);
                    h33 h33Var = z13Var != null ? z13Var.a : null;
                    stringBuffer.append(h33Var != null ? h33Var.f(h33Var.a(strGroup, bundle)) : Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (y23Var != null && y23Var.a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", j5Var.u);
        Context context = this.c;
        Resources resources = context.getResources();
        if (y23Var != null) {
            int i = y23Var.h;
            int i2 = y23Var.i;
            if ((i <= 0 || !h12.c(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !h12.c(resources.getResourceTypeName(i2), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i2) + " when launching " + j5Var);
            }
        }
        context.startActivity(intent2);
        if (y23Var != null && activity != null) {
            int i3 = y23Var.f;
            int i4 = y23Var.g;
            if ((i3 > 0 && h12.c(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && h12.c(resources.getResourceTypeName(i4), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i3) + " and exit resource " + resources.getResourceName(i4) + "when launching " + j5Var);
                return null;
            }
            if (i3 >= 0 || i4 >= 0) {
                if (i3 < 0) {
                    i3 = 0;
                }
                activity.overridePendingTransition(i3, i4 >= 0 ? i4 : 0);
            }
        }
        return null;
    }

    @Override // defpackage.t43
    public final boolean j() {
        Activity activity = this.d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
