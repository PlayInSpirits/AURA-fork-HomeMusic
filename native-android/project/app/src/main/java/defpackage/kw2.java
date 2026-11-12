package defpackage;

import android.content.ContentValues;
import android.database.SQLException;
import android.text.TextUtils;
import androidx.work.OverwritingInputMerger;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kw2 extends jw2 {
    public static final kw2 d = null;
    public static final kw2 e = null;
    public static final kw2 f = null;
    public static final kw2 g = null;
    public static final kw2 h = null;
    public static final kw2 i = null;
    public static final kw2 j = null;
    public static final kw2 k = null;
    public static final kw2 l = null;
    public static final kw2 m = null;
    public final /* synthetic */ int c;

    static {
        int r3 = 11;
        d = new kw2(r3, 12, 0);
        int r4 = 12;
        e = new kw2(r4, 13, 1);
        int r5 = 15;
        f = new kw2(r5, 16, 2);
        int r6 = 16;
        g = new kw2(r6, 17, 3);
        int r7 = 1;
        h = new kw2(r7, 2, 4);
        int r8 = 3;
        i = new kw2(r8, 4, 5);
        int r9 = 4;
        j = new kw2(r9, 5, 6);
        int r10 = 6;
        k = new kw2(r10, 7, 7);
        int r11 = 7;
        l = new kw2(r11, 8, 8);
        int r12 = 8;
        m = new kw2(r12, 9, 9);
    }

    public kw2(int r2) {
        this.c = r2;
        switch(r2) {
            case 28: goto L6;
            default: goto L4;
        };
    L4:
        super(14, 15);
        return;
    L6:
        super(19, 20);
    }

    @Override // defpackage.jw2
    public void a(we1 r10) {
        switch(this.c) {
            case 0: goto L53;
            case 1: goto L51;
            case 2: goto L49;
            case 3: goto L47;
            case 4: goto L45;
            case 5: goto L43;
            case 6: goto L41;
            case 7: goto L39;
            case 8: goto L37;
            case 9: goto L35;
            case 10: goto L4;
            case 11: goto L4;
            case 12: goto L4;
            case 13: goto L4;
            case 14: goto L4;
            case 15: goto L4;
            case 16: goto L4;
            case 17: goto L4;
            case 18: goto L4;
            case 19: goto L4;
            case 20: goto L4;
            case 21: goto L4;
            case 22: goto L4;
            case 23: goto L33;
            case 24: goto L14;
            case 25: goto L12;
            case 26: goto L10;
            case 27: goto L8;
            case 28: goto L6;
            default: goto L4;
        };
    L4:
        super.a(r10);
        return;
    L6:
        r10.q("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        r10.q("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
        r10.q("DROP TABLE `WorkSpec`");
        r10.q("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
        r10.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        r10.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        r10.q("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
        return;
    L8:
        r10.q("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
        return;
    L10:
        r10.q("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        r10.q("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
        return;
    L12:
        r10.q("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        r10.q("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
        r10.q("DROP TABLE `WorkSpec`");
        r10.q("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
        r10.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        r10.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        return;
    L14:
        r10.q("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        r10.q("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
        r10.q("DROP TABLE `WorkSpec`");
        r10.q("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
        r10.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        r10.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        r10.q("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues r9 = new ContentValues(1);
        r9.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        int r0 = 0;
        Object[] r1 = new Object[0];
        if (r9.size() == 0) goto L31;
        int r2 = r9.size();
        int r3 = r1.length + r2;
        Object[] r4 = new Object[r3];
        StringBuilder r5 = new StringBuilder("UPDATE ");
        r5.append(we1.o[3]);
        r5.append("WorkSpec SET ");
        Iterator<String> r6 = r9.keySet().iterator();
    L18:
        if (r6.hasNext() == false) goto L24;
        String r7 = r6.next();
        if (r0 <= 0) goto L22;
        String r8 = ",";
    L23:
        r5.append(r8);
        r5.append(r7);
        r4[r0] = r9.get(r7);
        r5.append("=?");
        r0 = r0 + 1;
        goto L18
    L22:
        r8 = "";
        goto L23
    L24:
        int r11 = r2;
    L25:
        if (r11 >= r3) goto L28;
        r4[r11] = r1[r11 - r2];
        r11 = r11 + 1;
        goto L25
    L28:
        if (TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ") == true) goto L30;
        r5.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
    L30:
        df1 r12 = r10.j(r5.toString());
        g12.f(r12, r4);
        r12.o.executeUpdateDelete();
        return;
    L31:
        kf2.n("Empty values");
        return;
    L33:
        r10.q("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        r10.q("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
        r10.q("DROP TABLE `WorkSpec`");
        r10.q("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
        r10.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        r10.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        return;
    L35:
        r10.getClass();
        r10.q("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        return;
    L37:
        r10.getClass();
        r10.q("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
        return;
    L39:
        r10.getClass();
        r10.q("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        return;
    L41:
        r10.getClass();
        r10.q("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        r10.q("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        return;
    L43:
        r10.getClass();
        r10.q("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
        return;
    L45:
        r10.getClass();
        r10.q("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        r10.q("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        r10.q("DROP TABLE IF EXISTS alarmInfo");
        r10.q("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
        return;
    L47:
        r10.getClass();
        r10.q(rm4.c0("UPDATE WorkSpec\n                SET input_merger_class_name = '" + OverwritingInputMerger.class.getName() + "'\n                WHERE input_merger_class_name IS NULL\n                "));
        r10.q("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (\n                `id` TEXT NOT NULL,\n                `state` INTEGER NOT NULL,\n                `worker_class_name` TEXT NOT NULL,\n                `input_merger_class_name` TEXT NOT NULL,\n                `input` BLOB NOT NULL,\n                `output` BLOB NOT NULL,\n                `initial_delay` INTEGER NOT NULL,\n                `interval_duration` INTEGER NOT NULL,\n                `flex_duration` INTEGER NOT NULL,\n                `run_attempt_count` INTEGER NOT NULL,\n                `backoff_policy` INTEGER NOT NULL,\n                `backoff_delay_duration` INTEGER NOT NULL,\n                `last_enqueue_time` INTEGER NOT NULL,\n                `minimum_retention_duration` INTEGER NOT NULL,\n                `schedule_requested_at` INTEGER NOT NULL,\n                `run_in_foreground` INTEGER NOT NULL,\n                `out_of_quota_policy` INTEGER NOT NULL,\n                `period_count` INTEGER NOT NULL DEFAULT 0,\n                `generation` INTEGER NOT NULL DEFAULT 0,\n                `required_network_type` INTEGER NOT NULL,\n                `requires_charging` INTEGER NOT NULL,\n                `requires_device_idle` INTEGER NOT NULL,\n                `requires_battery_not_low` INTEGER NOT NULL,\n                `requires_storage_not_low` INTEGER NOT NULL,\n                `trigger_content_update_delay` INTEGER NOT NULL,\n                `trigger_max_content_delay` INTEGER NOT NULL,\n                `content_uri_triggers` BLOB NOT NULL,\n                PRIMARY KEY(`id`)\n                )");
        r10.q("INSERT INTO `_new_WorkSpec` (\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            ) SELECT\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            FROM `WorkSpec`");
        r10.q("DROP TABLE `WorkSpec`");
        r10.q("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
        r10.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at`ON `WorkSpec` (`schedule_requested_at`)");
        r10.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON`WorkSpec` (`last_enqueue_time`)");
        return;
    L49:
        r10.getClass();
        r10.q("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        r10.q("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        r10.q("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        r10.q("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        r10.q("DROP TABLE `SystemIdInfo`");
        r10.q("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
        return;
    L51:
        r10.getClass();
        r10.q("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        r10.q("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
        return;
    L53:
        r10.getClass();
        r10.q("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }

    @Override // defpackage.jw2
    public void b(x34 r3) {
        switch(this.c) {
            case 10: goto L40;
            case 11: goto L38;
            case 12: goto L36;
            case 13: goto L34;
            case 14: goto L32;
            case 15: goto L30;
            case 16: goto L28;
            case 17: goto L26;
            case 18: goto L14;
            case 19: goto L12;
            case 20: goto L10;
            case 21: goto L8;
            case 22: goto L6;
            default: goto L4;
        };
    L4:
        super.b(r3);
        return;
    L6:
        h12.n(r3, "CREATE TABLE IF NOT EXISTS `synced_playlist` (`playlistId` TEXT NOT NULL, `serverId` TEXT NOT NULL, PRIMARY KEY(`playlistId`, `serverId`))");
        return;
    L8:
        h12.n(r3, "ALTER TABLE `queue` ADD COLUMN `album_artist` TEXT DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `download` ADD COLUMN `album_artist` TEXT DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `chronology` ADD COLUMN `album_artist` TEXT DEFAULT NULL");
        return;
    L10:
        h12.n(r3, "ALTER TABLE `playlist` ADD COLUMN `lastPlayed` INTEGER NOT NULL DEFAULT 0");
        return;
    L12:
        h12.n(r3, "ALTER TABLE `internet_radio_station_cache` ADD COLUMN `source` TEXT NOT NULL DEFAULT 'subsonic'");
        h12.n(r3, "ALTER TABLE `internet_radio_station_cache` ADD COLUMN `cover_art_url` TEXT DEFAULT NULL");
        return;
    L14:
        h12.n(r3, "CREATE TABLE IF NOT EXISTS `_new_playlist_song` (`playlist_id` TEXT NOT NULL, `id` TEXT NOT NULL, `title` TEXT, `artist` TEXT, `album` TEXT, `track` INTEGER, `cover_art_id` TEXT, `duration` INTEGER, `album_id` TEXT, `artist_id` TEXT, PRIMARY KEY(`playlist_id`, `id`), FOREIGN KEY(`playlist_id`) REFERENCES `playlist`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        h12.n(r3, "INSERT INTO `_new_playlist_song` (`playlist_id`,`id`,`title`,`artist`,`album`,`track`,`cover_art_id`,`duration`,`album_id`,`artist_id`) SELECT `playlist_id`,`id`,`title`,`artist`,`album`,`track`,`cover_art_id`,`duration`,`album_id`,`artist_id` FROM `playlist_song`");
        h12.n(r3, "DROP TABLE `playlist_song`");
        h12.n(r3, "ALTER TABLE `_new_playlist_song` RENAME TO `playlist_song`");
        h12.n(r3, "CREATE INDEX IF NOT EXISTS `index_playlist_song_playlist_id` ON `playlist_song` (`playlist_id`)");
        z34 r2 = r3.U("PRAGMA foreign_key_check(`playlist_song`)");
    L21:
        th = move-exception;
        throw th;     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        ud3.e(r2, th);
        throw th;
    L16:
        if (r2.O() == true) goto L20;
        ud3.e(r2, null);
        return;
    L20:
        throw new SQLException(uo.N(r2));     // Catch: Throwable -> L21
    L26:
        h12.n(r3, "CREATE TABLE IF NOT EXISTS `playlist_song` (`playlist_id` TEXT NOT NULL, `id` TEXT NOT NULL, `title` TEXT, `artist` TEXT, `album` TEXT, `track` INTEGER, `cover_art_id` TEXT, `duration` INTEGER, `album_id` TEXT, `artist_id` TEXT, PRIMARY KEY(`playlist_id`, `id`), FOREIGN KEY(`playlist_id`) REFERENCES `playlist`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        h12.n(r3, "CREATE INDEX IF NOT EXISTS `index_playlist_song_playlist_id` ON `playlist_song` (`playlist_id`)");
        return;
    L28:
        h12.n(r3, "CREATE TABLE IF NOT EXISTS `internet_radio_station_cache` (`id` TEXT NOT NULL, `name` TEXT, `stream_url` TEXT, `home_page_url` TEXT, PRIMARY KEY(`id`))");
        return;
    L30:
        h12.n(r3, "ALTER TABLE `playlist` ADD COLUMN `comment` TEXT DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `playlist` ADD COLUMN `owner` TEXT DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `playlist` ADD COLUMN `isUniversal` INTEGER DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `playlist` ADD COLUMN `songCount` INTEGER NOT NULL DEFAULT 0");
        h12.n(r3, "ALTER TABLE `playlist` ADD COLUMN `created` INTEGER DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `playlist` ADD COLUMN `changed` INTEGER DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `playlist` ADD COLUMN `allowedUsers` TEXT DEFAULT NULL");
        h12.n(r3, "CREATE TABLE IF NOT EXISTS `pinned_playlist` (`playlistId` TEXT NOT NULL, PRIMARY KEY(`playlistId`))");
        return;
    L32:
        h12.n(r3, "ALTER TABLE `queue` ADD COLUMN `rg_track_gain` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `queue` ADD COLUMN `rg_album_gain` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `queue` ADD COLUMN `rg_track_peak` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `queue` ADD COLUMN `rg_album_peak` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `queue` ADD COLUMN `rg_base_gain` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `queue` ADD COLUMN `rg_fallback_gain` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `download` ADD COLUMN `rg_track_gain` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `download` ADD COLUMN `rg_album_gain` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `download` ADD COLUMN `rg_track_peak` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `download` ADD COLUMN `rg_album_peak` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `download` ADD COLUMN `rg_base_gain` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `download` ADD COLUMN `rg_fallback_gain` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `chronology` ADD COLUMN `rg_track_gain` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `chronology` ADD COLUMN `rg_album_gain` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `chronology` ADD COLUMN `rg_track_peak` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `chronology` ADD COLUMN `rg_album_peak` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `chronology` ADD COLUMN `rg_base_gain` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `chronology` ADD COLUMN `rg_fallback_gain` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `session_media_item` ADD COLUMN `rg_track_gain` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `session_media_item` ADD COLUMN `rg_album_gain` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `session_media_item` ADD COLUMN `rg_track_peak` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `session_media_item` ADD COLUMN `rg_album_peak` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `session_media_item` ADD COLUMN `rg_base_gain` REAL DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `session_media_item` ADD COLUMN `rg_fallback_gain` REAL DEFAULT NULL");
        return;
    L34:
        h12.n(r3, "ALTER TABLE `server` ADD COLUMN `client_cert` TEXT DEFAULT NULL");
        return;
    L36:
        h12.n(r3, "ALTER TABLE `recent_search` ADD COLUMN `timestamp` INTEGER NOT NULL DEFAULT 0");
        return;
    L38:
        h12.n(r3, "CREATE TABLE IF NOT EXISTS `lyrics_cache` (`song_id` TEXT NOT NULL, `artist` TEXT, `title` TEXT, `lyrics` TEXT, `structured_lyrics` TEXT, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`song_id`))");
        return;
    L40:
        h12.n(r3, "ALTER TABLE `queue` ADD COLUMN `sampling_rate` INTEGER DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `queue` ADD COLUMN `bit_depth` INTEGER DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `download` ADD COLUMN `sampling_rate` INTEGER DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `download` ADD COLUMN `bit_depth` INTEGER DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `chronology` ADD COLUMN `sampling_rate` INTEGER DEFAULT NULL");
        h12.n(r3, "ALTER TABLE `chronology` ADD COLUMN `bit_depth` INTEGER DEFAULT NULL");
    }

    public /* synthetic */ kw2(int r1, int r2, int r3) {
        this.c = r3;
        super(r1, r2);
    }
}
