package defpackage;

import android.content.ContentValues;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.database.DatabaseIOException;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ss0 implements xx, j45 {
    public static final String[] r = {"id", "key", "metadata"};
    public Object n;
    public Object o;
    public Object p;
    public Object q;

    public ss0(int i) {
        switch (i) {
            case 5:
                this.n = new ArrayList();
                this.o = new HashMap();
                this.p = new HashMap();
                break;
            default:
                this.n = new jo3(10);
                this.o = new yd4(0);
                this.p = new ArrayList();
                this.q = new HashSet();
                break;
        }
    }

    public static ss0 C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_library_catalogue_album, viewGroup, false);
        int i = R.id.album_catalogue_cover_image_view;
        ImageView imageView = (ImageView) uo.s(viewInflate, R.id.album_catalogue_cover_image_view);
        if (imageView != null) {
            i = R.id.album_name_label;
            TextView textView = (TextView) uo.s(viewInflate, R.id.album_name_label);
            if (textView != null) {
                i = R.id.artist_name_label;
                TextView textView2 = (TextView) uo.s(viewInflate, R.id.artist_name_label);
                if (textView2 != null) {
                    return new ss0((ConstraintLayout) viewInflate, imageView, textView, textView2);
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public double A(ol1 ol1Var) {
        double dDoubleValue = ((Double) ((HashMap) B()).get((ol1) ((ArrayList) z()).get(((ArrayList) z()).size() - 1))).doubleValue() - ((Double) ((HashMap) B()).get((ol1) ((ArrayList) z()).get(0))).doubleValue();
        double dDoubleValue2 = ((Double) ((HashMap) B()).get(ol1Var)).doubleValue() - ((Double) ((HashMap) B()).get((ol1) ((ArrayList) z()).get(0))).doubleValue();
        if (dDoubleValue == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue2 / dDoubleValue;
    }

    public Map B() {
        HashMap map = (HashMap) this.q;
        if (map != null) {
            return map;
        }
        ArrayList arrayList = new ArrayList(y());
        arrayList.add((ol1) this.n);
        HashMap map2 = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ol1 ol1Var = (ol1) obj;
            double[] dArrC = h12.C(ol1Var.d);
            double degrees = Math.toDegrees(Math.atan2(dArrC[2], dArrC[1])) % 360.0d;
            if (degrees < 0.0d) {
                degrees += 360.0d;
            }
            double dPow = Math.pow(Math.hypot(dArrC[1], dArrC[2]), 1.07d) * 0.02d;
            double d = (degrees - 50.0d) % 360.0d;
            if (d < 0.0d) {
                d += 360.0d;
            }
            map2.put(ol1Var, Double.valueOf((Math.cos(Math.toRadians(d)) * dPow) - 0.5d));
        }
        this.q = map2;
        return map2;
    }

    public void D(SQLiteDatabase sQLiteDatabase) {
        String str = (String) this.p;
        str.getClass();
        r45.b(sQLiteDatabase, 1, str, 1);
        String str2 = (String) this.q;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.q) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    public void E(fe1 fe1Var) {
        kc1 kc1Var = fe1Var.c;
        String str = kc1Var.r;
        HashMap map = (HashMap) this.o;
        if (map.get(str) != null) {
            return;
        }
        map.put(kc1Var.r, fe1Var);
        if (ld1.I(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + kc1Var);
        }
    }

    public void F(fe1 fe1Var) {
        HashMap map = (HashMap) this.o;
        kc1 kc1Var = fe1Var.c;
        if (kc1Var.O) {
            ((od1) this.q).f(kc1Var);
        }
        if (map.get(kc1Var.r) == fe1Var && ((fe1) map.put(kc1Var.r, null)) != null && ld1.I(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + kc1Var);
        }
    }

    public Bundle G(String str, Bundle bundle) {
        HashMap map = (HashMap) this.p;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public void H() {
        int iA;
        h45 h45Var = (h45) this.o;
        rm2 rm2Var = (rm2) this.n;
        ViewPager2 viewPager2 = (ViewPager2) this.q;
        int i = android.R.id.accessibilityActionPageLeft;
        j65.l(viewPager2, android.R.id.accessibilityActionPageLeft);
        j65.i(viewPager2, 0);
        j65.l(viewPager2, android.R.id.accessibilityActionPageRight);
        j65.i(viewPager2, 0);
        j65.l(viewPager2, android.R.id.accessibilityActionPageUp);
        j65.i(viewPager2, 0);
        j65.l(viewPager2, android.R.id.accessibilityActionPageDown);
        j65.i(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (iA = viewPager2.getAdapter().a()) == 0 || !viewPager2.E) {
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.q < iA - 1) {
                j65.m(viewPager2, new o3(android.R.id.accessibilityActionPageDown, (String) null), rm2Var);
            }
            if (viewPager2.q > 0) {
                j65.m(viewPager2, new o3(android.R.id.accessibilityActionPageUp, (String) null), h45Var);
                return;
            }
            return;
        }
        boolean z = viewPager2.t.b.getLayoutDirection() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (viewPager2.q < iA - 1) {
            j65.m(viewPager2, new o3(i2, (String) null), rm2Var);
        }
        if (viewPager2.q > 0) {
            j65.m(viewPager2, new o3(i, (String) null), h45Var);
        }
    }

    @Override // defpackage.xx
    public void b(HashMap map) throws DatabaseIOException {
        try {
            SQLiteDatabase writableDatabase = ((tk4) this.n).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                D(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    q(writableDatabase, (wx) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                ((SparseArray) this.o).clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.xx
    public void c(wx wxVar, boolean z) {
        SparseArray sparseArray = (SparseArray) this.o;
        int i = wxVar.a;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    @Override // defpackage.g45
    public ce d(long j, ce ceVar, ce ceVar2, ce ceVar3) {
        if (((ce) this.p) == null) {
            this.p = ceVar3.c();
        }
        ce ceVar4 = (ce) this.p;
        if (ceVar4 == null) {
            h12.Q("velocityVector");
            throw null;
        }
        int iB = ceVar4.b();
        int i = 0;
        while (true) {
            ce ceVar5 = (ce) this.p;
            if (i >= iB) {
                if (ceVar5 != null) {
                    return ceVar5;
                }
                h12.Q("velocityVector");
                throw null;
            }
            if (ceVar5 == null) {
                h12.Q("velocityVector");
                throw null;
            }
            ceVar5.d(i, ((de) this.n).get(i).b(j, ceVar.a(i), ceVar2.a(i), ceVar3.a(i)));
            i++;
        }
    }

    @Override // defpackage.xx
    public void e(wx wxVar) {
        ((SparseArray) this.o).put(wxVar.a, wxVar);
    }

    @Override // defpackage.xx
    public boolean f() throws DatabaseIOException {
        try {
            SQLiteDatabase readableDatabase = ((tk4) this.n).getReadableDatabase();
            String str = (String) this.p;
            str.getClass();
            return r45.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.xx
    public void g(HashMap map) throws DatabaseIOException {
        SparseArray sparseArray = (SparseArray) this.o;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = ((tk4) this.n).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    wx wxVar = (wx) sparseArray.valueAt(i);
                    if (wxVar == null) {
                        int iKeyAt = sparseArray.keyAt(i);
                        String str = (String) this.q;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        q(writableDatabase, wxVar);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.xx
    public void h(long j) {
        String hexString = Long.toHexString(j);
        this.p = hexString;
        this.q = xa3.g("ExoPlayerCacheIndex", hexString);
    }

    @Override // defpackage.xx
    public void i(HashMap map, SparseArray sparseArray) throws DatabaseIOException {
        tk4 tk4Var = (tk4) this.n;
        rr2.w(((SparseArray) this.o).size() == 0);
        try {
            SQLiteDatabase readableDatabase = tk4Var.getReadableDatabase();
            String str = (String) this.p;
            str.getClass();
            if (r45.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = tk4Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    D(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = tk4Var.getReadableDatabase();
            String str2 = (String) this.q;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, r, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new wx(i, string, ml3.f(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i, string);
                } catch (Throwable th2) {
                    if (cursorQuery == null) {
                        throw th2;
                    }
                    try {
                        cursorQuery.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e) {
            map.clear();
            sparseArray.clear();
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.xx
    public void j() throws DatabaseIOException {
        tk4 tk4Var = (tk4) this.n;
        String str = (String) this.p;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = tk4Var.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = r45.a;
                try {
                    if (f35.f0(writableDatabase, "ExoPlayerVersions")) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(strConcat));
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    @Override // defpackage.g45
    public ce k(long j, ce ceVar, ce ceVar2, ce ceVar3) {
        if (((ce) this.o) == null) {
            this.o = ceVar.c();
        }
        ce ceVar4 = (ce) this.o;
        if (ceVar4 == null) {
            h12.Q("valueVector");
            throw null;
        }
        int iB = ceVar4.b();
        int i = 0;
        while (true) {
            ce ceVar5 = (ce) this.o;
            if (i >= iB) {
                if (ceVar5 != null) {
                    return ceVar5;
                }
                h12.Q("valueVector");
                throw null;
            }
            if (ceVar5 == null) {
                h12.Q("valueVector");
                throw null;
            }
            ceVar5.d(i, ((de) this.n).get(i).e(j, ceVar.a(i), ceVar2.a(i), ceVar3.a(i)));
            i++;
        }
    }

    @Override // defpackage.g45
    public ce l(ce ceVar, ce ceVar2, ce ceVar3) {
        if (((ce) this.q) == null) {
            this.q = ceVar3.c();
        }
        ce ceVar4 = (ce) this.q;
        if (ceVar4 == null) {
            h12.Q("endVelocityVector");
            throw null;
        }
        int iB = ceVar4.b();
        int i = 0;
        while (true) {
            ce ceVar5 = (ce) this.q;
            if (i >= iB) {
                if (ceVar5 != null) {
                    return ceVar5;
                }
                h12.Q("endVelocityVector");
                throw null;
            }
            if (ceVar5 == null) {
                h12.Q("endVelocityVector");
                throw null;
            }
            ceVar5.d(i, ((de) this.n).get(i).d(ceVar.a(i), ceVar2.a(i), ceVar3.a(i)));
            i++;
        }
    }

    @Override // defpackage.g45
    public long m(ce ceVar, ce ceVar2, ce ceVar3) {
        int iB = ceVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((de) this.n).get(i).c(ceVar.a(i), ceVar2.a(i), ceVar3.a(i)));
        }
        return jMax;
    }

    public void n(ArrayList arrayList) {
        if (arrayList == null) {
            kf2.n("filters must not be null");
            return;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            IntentFilter intentFilter = (IntentFilter) obj;
            if (intentFilter != null) {
                ArrayList arrayList2 = (ArrayList) this.p;
                if (!arrayList2.contains(intentFilter)) {
                    arrayList2.add(intentFilter);
                }
            }
        }
    }

    public void o(kc1 kc1Var) {
        if (((ArrayList) this.n).contains(kc1Var)) {
            er1.o(kc1Var, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.n)) {
            ((ArrayList) this.n).add(kc1Var);
        }
        kc1Var.x = true;
    }

    public void p(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            ArrayList arrayList2 = (ArrayList) this.o;
            if (TextUtils.isEmpty(str)) {
                kf2.n("groupMemberId must not be empty");
                return;
            } else if (!arrayList2.contains(str)) {
                arrayList2.add(str);
            }
        }
    }

    public void q(SQLiteDatabase sQLiteDatabase, wx wxVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ml3.g(wxVar.e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(wxVar.a));
        contentValues.put("key", wxVar.b);
        contentValues.put("metadata", byteArray);
        String str = (String) this.q;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    public sp2 r() {
        Bundle bundle = (Bundle) this.n;
        bundle.putParcelableArrayList("controlFilters", new ArrayList<>((ArrayList) this.p));
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>((ArrayList) this.o));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>((HashSet) this.q));
        return new sp2(bundle);
    }

    public void s(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            tb4.e("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((yd4) this.o).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                s(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public kc1 t(String str) {
        fe1 fe1Var = (fe1) ((HashMap) this.o).get(str);
        if (fe1Var != null) {
            return fe1Var.c;
        }
        return null;
    }

    public kc1 u(String str) {
        for (fe1 fe1Var : ((HashMap) this.o).values()) {
            if (fe1Var != null) {
                kc1 kc1VarU = fe1Var.c;
                if (!str.equals(kc1VarU.r)) {
                    kc1VarU = kc1VarU.H.c.u(str);
                }
                if (kc1VarU != null) {
                    return kc1VarU;
                }
            }
        }
        return null;
    }

    public ArrayList v() {
        ArrayList arrayList = new ArrayList();
        for (fe1 fe1Var : ((HashMap) this.o).values()) {
            if (fe1Var != null) {
                arrayList.add(fe1Var);
            }
        }
        return arrayList;
    }

    public ArrayList w() {
        ArrayList arrayList = new ArrayList();
        for (fe1 fe1Var : ((HashMap) this.o).values()) {
            if (fe1Var != null) {
                arrayList.add(fe1Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List x() {
        ArrayList arrayList;
        if (((ArrayList) this.n).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.n)) {
            arrayList = new ArrayList((ArrayList) this.n);
        }
        return arrayList;
    }

    public List y() {
        List list = (List) this.p;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            ol1 ol1Var = (ol1) this.n;
            arrayList.add(ol1.a(d, ol1Var.b, ol1Var.c));
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.p = listUnmodifiableList;
        return listUnmodifiableList;
    }

    public List z() {
        ArrayList arrayList = (ArrayList) this.o;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(y());
        arrayList2.add((ol1) this.n);
        Collections.sort(arrayList2, Comparator.comparing(new t8(3, this), new n7(22)));
        this.o = arrayList2;
        return arrayList2;
    }

    public /* synthetic */ ss0(Object obj) {
        this.n = obj;
    }

    public /* synthetic */ ss0(ConstraintLayout constraintLayout, View view, TextView textView, TextView textView2) {
        this.n = constraintLayout;
        this.o = view;
        this.p = textView;
        this.q = textView2;
    }

    public ss0(gy3 gy3Var, xc5 xc5Var, hd5 hd5Var, wo0 wo0Var) {
        Object objK;
        if (gy3Var != null) {
            objK = yw1.k(gy3Var);
        } else {
            vw1 vw1Var = yw1.o;
            objK = gy3.r;
        }
        this.n = objK;
        this.o = xc5Var;
        this.p = hd5Var;
        this.q = wo0Var;
    }

    public ss0(String str, String str2) {
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new HashSet();
        Bundle bundle = new Bundle();
        this.n = bundle;
        if (str != null) {
            bundle.putString("id", str);
            if (str2 != null) {
                bundle.putString("name", str2);
                return;
            } else {
                nz2.n("name must not be null");
                throw null;
            }
        }
        nz2.n("id must not be null");
        throw null;
    }

    public ss0(c81 c81Var) {
        this(new oz4(c81Var));
    }
}
