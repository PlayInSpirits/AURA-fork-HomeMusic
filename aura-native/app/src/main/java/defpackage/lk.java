package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class lk implements uw2 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public lk(Context context, jq0 jq0Var) {
        this.a = 1;
        this.b = context.getApplicationContext();
        this.c = jq0Var;
    }

    @Override // defpackage.uw2
    public final boolean a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0))) {
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    if (((uw2) obj3).a(obj)) {
                        break;
                    }
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                break;
            default:
                Uri uri2 = (Uri) obj;
                if ("android.resource".equals(uri2.getScheme()) && ((Context) obj2).getPackageName().equals(uri2.getAuthority())) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.uw2
    public final tw2 b(Object obj, int i, int i2, db3 db3Var) {
        v61 v61Var;
        tw2 b;
        Uri uri;
        int i3 = this.a;
        tw2 tw2Var = null;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                Uri uri2 = (Uri) obj;
                String substring = uri2.toString().substring(22);
                s73 s73Var = new s73(uri2);
                AssetManager assetManager = (AssetManager) obj2;
                switch (((kk) obj3).a) {
                    case 0:
                        v61Var = new v61(assetManager, substring, 0);
                        break;
                    default:
                        v61Var = new v61(assetManager, substring, 1);
                        break;
                }
                return new tw2(s73Var, v61Var);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) db3Var.c(v04.b);
                return new tw2(new s73(num), new kq0(theme, theme != null ? theme.getResources() : ((Context) obj2).getResources(), (jq0) obj3, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                f42 f42Var = null;
                for (int i4 = 0; i4 < size; i4++) {
                    uw2 uw2Var = (uw2) arrayList.get(i4);
                    if (uw2Var.a(obj) && (b = uw2Var.b(obj, i, i2, db3Var)) != null) {
                        f42Var = b.a;
                        arrayList2.add(b.c);
                    }
                }
                if (arrayList2.isEmpty() || f42Var == null) {
                    return null;
                }
                return new tw2(f42Var, new bz2(arrayList2, (io3) obj3));
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                Integer num2 = (Integer) obj;
                Resources resources = (Resources) obj3;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((uw2) obj2).b(uri, i, i2, db3Var);
            default:
                Uri uri3 = (Uri) obj;
                uw2 uw2Var2 = (uw2) obj3;
                List<String> pathSegments = uri3.getPathSegments();
                if (pathSegments.size() == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (parseInt != 0) {
                            tw2Var = uw2Var2.b(Integer.valueOf(parseInt), i, i2, db3Var);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return tw2Var;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return tw2Var;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return tw2Var;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                Context context = (Context) obj2;
                int identifier = context.getResources().getIdentifier(pathSegments2.get(1), pathSegments2.get(0), context.getPackageName());
                if (identifier != 0) {
                    return uw2Var2.b(Integer.valueOf(identifier), i, i2, db3Var);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public lk(Resources resources, uw2 uw2Var) {
        this.a = 3;
        this.c = resources;
        this.b = uw2Var;
    }

    public /* synthetic */ lk(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public lk(Context context, uw2 uw2Var) {
        this.a = 4;
        this.b = context.getApplicationContext();
        this.c = uw2Var;
    }
}
