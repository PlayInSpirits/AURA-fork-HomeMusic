package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.Parcel;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h95 implements zy3 {
    public final Object n;

    public h95(ba2 ba2Var) {
        ba2Var.getClass();
        this.n = new WeakReference(ba2Var);
    }

    public static void a(we1 we1Var) {
        SQLiteDatabase sQLiteDatabase = we1Var.n;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }

    public static u24 b(we1 we1Var) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new oq4(1, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSetK = f34.k(map, "prerequisite_id", new oq4(2, 1, "prerequisite_id", "TEXT", null, true), 2);
        hashSetK.add(new pq4("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSetK.add(new pq4("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new qq4("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet.add(new qq4("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        rq4 rq4Var = new rq4("Dependency", map, hashSetK, hashSet);
        rq4 rq4VarA = rq4.a(we1Var, "Dependency");
        if (!rq4Var.equals(rq4VarA)) {
            return new u24(false, f34.g("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", rq4Var, "\n Found:\n", rq4VarA));
        }
        HashMap map2 = new HashMap(32);
        map2.put("id", new oq4(1, 1, "id", "TEXT", null, true));
        map2.put("state", new oq4(0, 1, "state", "INTEGER", null, true));
        map2.put("worker_class_name", new oq4(0, 1, "worker_class_name", "TEXT", null, true));
        map2.put("input_merger_class_name", new oq4(0, 1, "input_merger_class_name", "TEXT", null, true));
        map2.put("input", new oq4(0, 1, "input", "BLOB", null, true));
        map2.put("output", new oq4(0, 1, "output", "BLOB", null, true));
        map2.put("initial_delay", new oq4(0, 1, "initial_delay", "INTEGER", null, true));
        map2.put("interval_duration", new oq4(0, 1, "interval_duration", "INTEGER", null, true));
        map2.put("flex_duration", new oq4(0, 1, "flex_duration", "INTEGER", null, true));
        map2.put("run_attempt_count", new oq4(0, 1, "run_attempt_count", "INTEGER", null, true));
        map2.put("backoff_policy", new oq4(0, 1, "backoff_policy", "INTEGER", null, true));
        map2.put("backoff_delay_duration", new oq4(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        map2.put("last_enqueue_time", new oq4(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
        map2.put("minimum_retention_duration", new oq4(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        map2.put("schedule_requested_at", new oq4(0, 1, "schedule_requested_at", "INTEGER", null, true));
        map2.put("run_in_foreground", new oq4(0, 1, "run_in_foreground", "INTEGER", null, true));
        map2.put("out_of_quota_policy", new oq4(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        map2.put("period_count", new oq4(0, 1, "period_count", "INTEGER", "0", true));
        map2.put("generation", new oq4(0, 1, "generation", "INTEGER", "0", true));
        map2.put("next_schedule_time_override", new oq4(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        map2.put("next_schedule_time_override_generation", new oq4(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
        map2.put("stop_reason", new oq4(0, 1, "stop_reason", "INTEGER", "-256", true));
        map2.put("trace_tag", new oq4(0, 1, "trace_tag", "TEXT", null, false));
        map2.put("required_network_type", new oq4(0, 1, "required_network_type", "INTEGER", null, true));
        map2.put("required_network_request", new oq4(0, 1, "required_network_request", "BLOB", "x''", true));
        map2.put("requires_charging", new oq4(0, 1, "requires_charging", "INTEGER", null, true));
        map2.put("requires_device_idle", new oq4(0, 1, "requires_device_idle", "INTEGER", null, true));
        map2.put("requires_battery_not_low", new oq4(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        map2.put("requires_storage_not_low", new oq4(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        map2.put("trigger_content_update_delay", new oq4(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        map2.put("trigger_max_content_delay", new oq4(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        HashSet hashSetK2 = f34.k(map2, "content_uri_triggers", new oq4(0, 1, "content_uri_triggers", "BLOB", null, true), 0);
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new qq4("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet2.add(new qq4("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        rq4 rq4Var2 = new rq4("WorkSpec", map2, hashSetK2, hashSet2);
        rq4 rq4VarA2 = rq4.a(we1Var, "WorkSpec");
        if (!rq4Var2.equals(rq4VarA2)) {
            return new u24(false, f34.g("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", rq4Var2, "\n Found:\n", rq4VarA2));
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new oq4(1, 1, "tag", "TEXT", null, true));
        HashSet hashSetK3 = f34.k(map3, "work_spec_id", new oq4(2, 1, "work_spec_id", "TEXT", null, true), 1);
        hashSetK3.add(new pq4("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet3 = new HashSet(1);
        hashSet3.add(new qq4("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        rq4 rq4Var3 = new rq4("WorkTag", map3, hashSetK3, hashSet3);
        rq4 rq4VarA3 = rq4.a(we1Var, "WorkTag");
        if (!rq4Var3.equals(rq4VarA3)) {
            return new u24(false, f34.g("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", rq4Var3, "\n Found:\n", rq4VarA3));
        }
        HashMap map4 = new HashMap(3);
        map4.put("work_spec_id", new oq4(1, 1, "work_spec_id", "TEXT", null, true));
        map4.put("generation", new oq4(2, 1, "generation", "INTEGER", "0", true));
        HashSet hashSetK4 = f34.k(map4, "system_id", new oq4(0, 1, "system_id", "INTEGER", null, true), 1);
        hashSetK4.add(new pq4("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        rq4 rq4Var4 = new rq4("SystemIdInfo", map4, hashSetK4, new HashSet(0));
        rq4 rq4VarA4 = rq4.a(we1Var, "SystemIdInfo");
        if (!rq4Var4.equals(rq4VarA4)) {
            return new u24(false, f34.g("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", rq4Var4, "\n Found:\n", rq4VarA4));
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new oq4(1, 1, "name", "TEXT", null, true));
        HashSet hashSetK5 = f34.k(map5, "work_spec_id", new oq4(2, 1, "work_spec_id", "TEXT", null, true), 1);
        hashSetK5.add(new pq4("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet4 = new HashSet(1);
        hashSet4.add(new qq4("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        rq4 rq4Var5 = new rq4("WorkName", map5, hashSetK5, hashSet4);
        rq4 rq4VarA5 = rq4.a(we1Var, "WorkName");
        if (!rq4Var5.equals(rq4VarA5)) {
            return new u24(false, f34.g("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", rq4Var5, "\n Found:\n", rq4VarA5));
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new oq4(1, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSetK6 = f34.k(map6, "progress", new oq4(0, 1, "progress", "BLOB", null, true), 1);
        hashSetK6.add(new pq4("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        rq4 rq4Var6 = new rq4("WorkProgress", map6, hashSetK6, new HashSet(0));
        rq4 rq4VarA6 = rq4.a(we1Var, "WorkProgress");
        if (!rq4Var6.equals(rq4VarA6)) {
            return new u24(false, f34.g("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", rq4Var6, "\n Found:\n", rq4VarA6));
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new oq4(1, 1, "key", "TEXT", null, true));
        rq4 rq4Var7 = new rq4("Preference", map7, f34.k(map7, "long_value", new oq4(0, 1, "long_value", "INTEGER", null, false), 0), new HashSet(0));
        rq4 rq4VarA7 = rq4.a(we1Var, "Preference");
        return !rq4Var7.equals(rq4VarA7) ? new u24(false, f34.g("Preference(androidx.work.impl.model.Preference).\n Expected:\n", rq4Var7, "\n Found:\n", rq4VarA7)) : new u24(true, (String) null);
    }

    @Override // defpackage.zy3
    public void accept(Object obj, Object obj2) {
        cr4 cr4Var = (cr4) obj2;
        bg5 bg5Var = (bg5) ((fg5) obj).e();
        kr4 kr4Var = (kr4) this.n;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(bg5Var.g);
        int i = mf5.a;
        if (kr4Var == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            kr4Var.writeToParcel(parcelObtain, 0);
        }
        try {
            bg5Var.f.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            cr4Var.b(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public /* synthetic */ h95(Object obj) {
        this.n = obj;
    }
}
