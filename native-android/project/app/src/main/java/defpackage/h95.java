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

    public h95(ba2 r2) {
        r2.getClass();
        this.n = new WeakReference(r2);
    }

    public static void a(we1 r1) {
        SQLiteDatabase r2 = r1.n;
        r2.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        r2.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        r2.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        r2.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        r2.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        r2.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        r2.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        r2.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        r2.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        r2.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }

    public static u24 b(we1 r23) {
        HashMap r1 = new HashMap(2);
        r1.put("work_spec_id", new oq4(1, 1, "work_spec_id", "TEXT", null, true));
        HashSet r5 = f34.k(r1, "prerequisite_id", new oq4(2, 1, "prerequisite_id", "TEXT", null, true), 2);
        r5.add(new pq4("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
        r5.add(new pq4("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
        HashSet r6 = new HashSet(2);
        r6.add(new qq4("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
        r6.add(new qq4("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"ASC"})));
        rq4 r3 = new rq4("Dependency", r1, r5, r6);
        rq4 r2 = rq4.a(r23, "Dependency");
        if (r3.equals(r2) == false) goto L5;
        HashMap r4 = new HashMap(32);
        r4.put("id", new oq4(1, 1, "id", "TEXT", null, true));
        r4.put("state", new oq4(0, 1, "state", "INTEGER", null, true));
        r4.put("worker_class_name", new oq4(0, 1, "worker_class_name", "TEXT", null, true));
        r4.put("input_merger_class_name", new oq4(0, 1, "input_merger_class_name", "TEXT", null, true));
        r4.put("input", new oq4(0, 1, "input", "BLOB", null, true));
        r4.put("output", new oq4(0, 1, "output", "BLOB", null, true));
        r4.put("initial_delay", new oq4(0, 1, "initial_delay", "INTEGER", null, true));
        r4.put("interval_duration", new oq4(0, 1, "interval_duration", "INTEGER", null, true));
        r4.put("flex_duration", new oq4(0, 1, "flex_duration", "INTEGER", null, true));
        r4.put("run_attempt_count", new oq4(0, 1, "run_attempt_count", "INTEGER", null, true));
        r4.put("backoff_policy", new oq4(0, 1, "backoff_policy", "INTEGER", null, true));
        r4.put("backoff_delay_duration", new oq4(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        r4.put("last_enqueue_time", new oq4(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
        r4.put("minimum_retention_duration", new oq4(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        r4.put("schedule_requested_at", new oq4(0, 1, "schedule_requested_at", "INTEGER", null, true));
        r4.put("run_in_foreground", new oq4(0, 1, "run_in_foreground", "INTEGER", null, true));
        r4.put("out_of_quota_policy", new oq4(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        r4.put("period_count", new oq4(0, 1, "period_count", "INTEGER", "0", true));
        r4.put("generation", new oq4(0, 1, "generation", "INTEGER", "0", true));
        r4.put("next_schedule_time_override", new oq4(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        r4.put("next_schedule_time_override_generation", new oq4(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
        r4.put("stop_reason", new oq4(0, 1, "stop_reason", "INTEGER", "-256", true));
        r4.put("trace_tag", new oq4(0, 1, "trace_tag", "TEXT", null, false));
        r4.put("required_network_type", new oq4(0, 1, "required_network_type", "INTEGER", null, true));
        r4.put("required_network_request", new oq4(0, 1, "required_network_request", "BLOB", "x''", true));
        r4.put("requires_charging", new oq4(0, 1, "requires_charging", "INTEGER", null, true));
        r4.put("requires_device_idle", new oq4(0, 1, "requires_device_idle", "INTEGER", null, true));
        r4.put("requires_battery_not_low", new oq4(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        r4.put("requires_storage_not_low", new oq4(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        r4.put("trigger_content_update_delay", new oq4(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        r4.put("trigger_max_content_delay", new oq4(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        HashSet r8 = f34.k(r4, "content_uri_triggers", new oq4(0, 1, "content_uri_triggers", "BLOB", null, true), 0);
        HashSet r10 = new HashSet(2);
        r10.add(new qq4("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
        r10.add(new qq4("index_WorkSpec_last_enqueue_time", false, Arrays.asList(new String[]{"last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
        rq4 r7 = new rq4("WorkSpec", r4, r8, r10);
        rq4 r9 = rq4.a(r23, "WorkSpec");
        if (r7.equals(r9) == false) goto L9;
        HashMap r11 = new HashMap(2);
        r11.put("tag", new oq4(1, 1, "tag", "TEXT", null, true));
        HashSet r12 = f34.k(r11, "work_spec_id", new oq4(2, 1, "work_spec_id", "TEXT", null, true), 1);
        r12.add(new pq4("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
        HashSet r13 = new HashSet(1);
        r13.add(new qq4("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
        rq4 r14 = new rq4("WorkTag", r11, r12, r13);
        rq4 r15 = rq4.a(r23, "WorkTag");
        if (r14.equals(r15) == false) goto L13;
        HashMap r16 = new HashMap(3);
        r16.put("work_spec_id", new oq4(1, 1, "work_spec_id", "TEXT", null, true));
        r16.put("generation", new oq4(2, 1, "generation", "INTEGER", "0", true));
        HashSet r17 = f34.k(r16, "system_id", new oq4(0, 1, "system_id", "INTEGER", null, true), 1);
        r17.add(new pq4("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
        rq4 r18 = new rq4("SystemIdInfo", r16, r17, new HashSet(0));
        rq4 r19 = rq4.a(r23, "SystemIdInfo");
        if (r18.equals(r19) == false) goto L17;
        HashMap r20 = new HashMap(2);
        r20.put("name", new oq4(1, 1, "name", "TEXT", null, true));
        HashSet r21 = f34.k(r20, "work_spec_id", new oq4(2, 1, "work_spec_id", "TEXT", null, true), 1);
        r21.add(new pq4("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
        HashSet r22 = new HashSet(1);
        r22.add(new qq4("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
        rq4 r24 = new rq4("WorkName", r20, r21, r22);
        rq4 r25 = rq4.a(r23, "WorkName");
        if (r24.equals(r25) == false) goto L21;
        HashMap r26 = new HashMap(2);
        r26.put("work_spec_id", new oq4(1, 1, "work_spec_id", "TEXT", null, true));
        HashSet r27 = f34.k(r26, "progress", new oq4(0, 1, "progress", "BLOB", null, true), 1);
        r27.add(new pq4("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
        rq4 r28 = new rq4("WorkProgress", r26, r27, new HashSet(0));
        rq4 r29 = rq4.a(r23, "WorkProgress");
        if (r28.equals(r29) == false) goto L25;
        HashMap r30 = new HashMap(2);
        r30.put("key", new oq4(1, 1, "key", "TEXT", null, true));
        rq4 r31 = new rq4("Preference", r30, f34.k(r30, "long_value", new oq4(0, 1, "long_value", "INTEGER", null, false), 0), new HashSet(0));
        rq4 r0 = rq4.a(r23, "Preference");
        if (r31.equals(r0) == true) goto L31;
        return new u24(false, f34.g("Preference(androidx.work.impl.model.Preference).\n Expected:\n", r31, "\n Found:\n", r0));
    L31:
        return new u24(true, null);
    L25:
        return new u24(false, f34.g("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", r28, "\n Found:\n", r29));
    L21:
        return new u24(false, f34.g("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", r24, "\n Found:\n", r25));
    L17:
        return new u24(false, f34.g("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", r18, "\n Found:\n", r19));
    L13:
        return new u24(false, f34.g("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", r14, "\n Found:\n", r15));
    L9:
        return new u24(false, f34.g("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", r7, "\n Found:\n", r9));
    L5:
        return new u24(false, f34.g("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", r3, "\n Found:\n", r2));
    }

    @Override // defpackage.zy3
    public void accept(Object r4, Object r5) {
        cr4 r6 = (cr4) r5;
        bg5 r7 = (bg5) ((fg5) r4).e();
        kr4 r3 = (kr4) this.n;
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken(r7.g);
        int r1 = mf5.a;
        if (r3 != null) goto L5;
        r0.writeInt(0);
    L12:
        r7.f.transact(1, r0, null, 1);     // Catch: Throwable -> L9
        r0.recycle();
        r6.b(null);
        return;
    L9:
        th = move-exception;
        r0.recycle();
        throw th;
    L5:
        r0.writeInt(1);
        r3.writeToParcel(r0, 0);
        goto L12
    }

    public /* synthetic */ h95(Object r1) {
        this.n = r1;
    }
}
