package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ip0 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Serializable f;
    public final Object g;
    public Object h;

    public ip0(AssetManager assetManager, Executor executor, sq3 sq3Var, String str, File file) {
        byte[] bArr;
        this.a = false;
        this.b = executor;
        this.c = sq3Var;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = au0.B;
                    break;
                case 26:
                    bArr = au0.A;
                    break;
                case 27:
                    bArr = au0.z;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = au0.y;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = au0.x;
        }
        this.d = bArr;
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((sq3) this.c).c();
            return null;
        }
    }

    public void b(int i, Serializable serializable) {
        ((Executor) this.b).execute(new gk(this, i, serializable, 3));
    }

    public void c() {
        int i;
        ui1 ui1Var = (ui1) this.c;
        PackageManager packageManager = (PackageManager) this.e;
        ArrayList arrayList = (ArrayList) this.f;
        if (this.a) {
            ArrayList arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null) {
                    if ((yq2.c == null ? false : yq2.c().p) && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                Object obj = arrayList2.get(i3);
                                i3++;
                                ServiceInfo serviceInfo2 = (ServiceInfo) obj;
                                if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                                }
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            i4 = -1;
                            break;
                        }
                        ComponentName componentName = ((cy3) arrayList.get(i4)).v;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 < 0) {
                        cy3 cy3Var = new cy3((Context) this.b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        cy3Var.C = new ss2(this, cy3Var);
                        if (!cy3Var.y) {
                            cy3Var.y = true;
                            cy3Var.l();
                        }
                        i = i2 + 1;
                        arrayList.add(i2, cy3Var);
                        ui1Var.a(cy3Var, false);
                    } else if (i4 >= i2) {
                        cy3 cy3Var2 = (cy3) arrayList.get(i4);
                        if (!cy3Var2.y) {
                            cy3Var2.y = true;
                            cy3Var2.l();
                        }
                        if (cy3Var2.A == null && cy3Var2.y && (cy3Var2.r != null || !cy3Var2.x.isEmpty())) {
                            cy3Var2.k();
                            cy3Var2.h();
                        }
                        i = i2 + 1;
                        Collections.swap(arrayList, i4, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i2; size3--) {
                    cy3 cy3Var3 = (cy3) arrayList.get(size3);
                    vq2 vq2VarD = ui1Var.d(cy3Var3);
                    if (vq2VarD != null) {
                        cy3Var3.getClass();
                        yq2.b();
                        cy3Var3.q = null;
                        cy3Var3.g(null);
                        ui1Var.m(vq2VarD, null);
                        ui1Var.a.b(514, vq2VarD);
                        ui1Var.k.remove(vq2VarD);
                    }
                    arrayList.remove(cy3Var3);
                    cy3Var3.C = null;
                    if (cy3Var3.y) {
                        cy3Var3.y = false;
                        cy3Var3.l();
                    }
                }
            }
        }
    }

    public ip0(Context context, ui1 ui1Var) {
        this.f = new ArrayList();
        this.g = new v9(9, this);
        this.h = new g5(26, this);
        this.b = context;
        this.c = ui1Var;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }
}
