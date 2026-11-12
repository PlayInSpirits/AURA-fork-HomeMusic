package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j5 extends r23 {
    public Intent x;
    public String y;

    public static String g(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        packageName.getClass();
        return xm4.i0(str, "${applicationId}", packageName);
    }

    @Override // defpackage.r23
    public final boolean equals(Object obj) {
        boolean zFilterEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof j5) && super.equals(obj)) {
            Intent intent = this.x;
            if (intent != null) {
                zFilterEquals = intent.filterEquals(((j5) obj).x);
            } else {
                zFilterEquals = ((j5) obj).x == null;
            }
            if (zFilterEquals && h12.c(this.y, ((j5) obj).y)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.r23
    public final void f(Context context, AttributeSet attributeSet) {
        super.f(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, rt3.a);
        typedArrayObtainAttributes.getClass();
        String strG = g(context, typedArrayObtainAttributes.getString(4));
        if (this.x == null) {
            this.x = new Intent();
        }
        Intent intent = this.x;
        intent.getClass();
        intent.setPackage(strG);
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.x == null) {
                this.x = new Intent();
            }
            Intent intent2 = this.x;
            intent2.getClass();
            intent2.setComponent(componentName);
        }
        String string2 = typedArrayObtainAttributes.getString(1);
        if (this.x == null) {
            this.x = new Intent();
        }
        Intent intent3 = this.x;
        intent3.getClass();
        intent3.setAction(string2);
        String strG2 = g(context, typedArrayObtainAttributes.getString(2));
        if (strG2 != null) {
            Uri uri = Uri.parse(strG2);
            if (this.x == null) {
                this.x = new Intent();
            }
            Intent intent4 = this.x;
            intent4.getClass();
            intent4.setData(uri);
        }
        this.y = g(context, typedArrayObtainAttributes.getString(3));
        typedArrayObtainAttributes.recycle();
    }

    @Override // defpackage.r23
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Intent intent = this.x;
        int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.y;
        return iFilterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.r23
    public final String toString() {
        Intent intent = this.x;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.x;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        return sb.toString();
    }
}
