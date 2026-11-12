package defpackage;

import android.content.ContentValues;
import android.database.SQLException;
import android.text.TextUtils;
import androidx.work.OverwritingInputMerger;
import com.eddyizm.tempus.homemusic.WaveRetry;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kw2 extends jw2 {
    public static final kw2 d = new kw2(11, 12, 0);
    public static final kw2 e = new kw2(12, 13, 1);
    public static final kw2 f = new kw2(15, 16, 2);
    public static final kw2 g = new kw2(16, 17, 3);
    public static final kw2 h = new kw2(1, 2, 4);
    public static final kw2 i = new kw2(3, 4, 5);
    public static final kw2 j = new kw2(4, 5, 6);
    public static final kw2 k = new kw2(6, 7, 7);
    public static final kw2 l = new kw2(7, 8, 8);
    public static final kw2 m = new kw2(8, 9, 9);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw2(int i2) {
        super(14, 15);
        this.c = i2;
        switch (i2) {
            case 28:
                super(19, 20);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.jw2
    public void a(we1 we1Var) {
        switch (this.c) {
            case 0:
                we1Var.getClass();
                we1Var.q("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                break;
            case 1:
                we1Var.getClass();
                we1Var.q("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                we1Var.q("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                break;
            case 2:
                we1Var.getClass();
                we1Var.q("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
                we1Var.q("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
                we1Var.q("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
                we1Var.q("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                we1Var.q("DROP TABLE `SystemIdInfo`");
                we1Var.q("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                we1Var.getClass();
                we1Var.q(rm4.c0("UPDATE WorkSpec\n                SET input_merger_class_name = '" + OverwritingInputMerger.class.getName() + "'\n                WHERE input_merger_class_name IS NULL\n                "));
                we1Var.q("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (\n                `id` TEXT NOT NULL,\n                `state` INTEGER NOT NULL,\n                `worker_class_name` TEXT NOT NULL,\n                `input_merger_class_name` TEXT NOT NULL,\n                `input` BLOB NOT NULL,\n                `output` BLOB NOT NULL,\n                `initial_delay` INTEGER NOT NULL,\n                `interval_duration` INTEGER NOT NULL,\n                `flex_duration` INTEGER NOT NULL,\n                `run_attempt_count` INTEGER NOT NULL,\n                `backoff_policy` INTEGER NOT NULL,\n                `backoff_delay_duration` INTEGER NOT NULL,\n                `last_enqueue_time` INTEGER NOT NULL,\n                `minimum_retention_duration` INTEGER NOT NULL,\n                `schedule_requested_at` INTEGER NOT NULL,\n                `run_in_foreground` INTEGER NOT NULL,\n                `out_of_quota_policy` INTEGER NOT NULL,\n                `period_count` INTEGER NOT NULL DEFAULT 0,\n                `generation` INTEGER NOT NULL DEFAULT 0,\n                `required_network_type` INTEGER NOT NULL,\n                `requires_charging` INTEGER NOT NULL,\n                `requires_device_idle` INTEGER NOT NULL,\n                `requires_battery_not_low` INTEGER NOT NULL,\n                `requires_storage_not_low` INTEGER NOT NULL,\n                `trigger_content_update_delay` INTEGER NOT NULL,\n                `trigger_max_content_delay` INTEGER NOT NULL,\n                `content_uri_triggers` BLOB NOT NULL,\n                PRIMARY KEY(`id`)\n                )");
                we1Var.q("INSERT INTO `_new_WorkSpec` (\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            ) SELECT\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            FROM `WorkSpec`");
                we1Var.q("DROP TABLE `WorkSpec`");
                we1Var.q("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                we1Var.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at`ON `WorkSpec` (`schedule_requested_at`)");
                we1Var.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON`WorkSpec` (`last_enqueue_time`)");
                break;
            case 4:
                we1Var.getClass();
                we1Var.q("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                we1Var.q("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                we1Var.q("DROP TABLE IF EXISTS alarmInfo");
                we1Var.q("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                break;
            case 5:
                we1Var.getClass();
                we1Var.q("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                break;
            case 6:
                we1Var.getClass();
                we1Var.q("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                we1Var.q("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                break;
            case 7:
                we1Var.getClass();
                we1Var.q("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                break;
            case 8:
                we1Var.getClass();
                we1Var.q("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                break;
            case 9:
                we1Var.getClass();
                we1Var.q("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case WaveRetry.MAX_FAILURES /* 16 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            default:
                super.a(we1Var);
                break;
            case 23:
                we1Var.q("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                we1Var.q("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                we1Var.q("DROP TABLE `WorkSpec`");
                we1Var.q("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                we1Var.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                we1Var.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                break;
            case 24:
                we1Var.q("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                we1Var.q("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                we1Var.q("DROP TABLE `WorkSpec`");
                we1Var.q("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                we1Var.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                we1Var.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                we1Var.q("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                int i2 = 0;
                Object[] objArr = new Object[0];
                if (contentValues.size() != 0) {
                    int size = contentValues.size();
                    int length = objArr.length + size;
                    Object[] objArr2 = new Object[length];
                    StringBuilder sb = new StringBuilder("UPDATE ");
                    sb.append(we1.o[3]);
                    sb.append("WorkSpec SET ");
                    for (String str : contentValues.keySet()) {
                        sb.append(i2 > 0 ? "," : "");
                        sb.append(str);
                        objArr2[i2] = contentValues.get(str);
                        sb.append("=?");
                        i2++;
                    }
                    for (int i3 = size; i3 < length; i3++) {
                        objArr2[i3] = objArr[i3 - size];
                    }
                    if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                        sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                    }
                    df1 df1VarJ = we1Var.j(sb.toString());
                    g12.f(df1VarJ, objArr2);
                    df1VarJ.o.executeUpdateDelete();
                } else {
                    kf2.n("Empty values");
                }
                break;
            case 25:
                we1Var.q("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                we1Var.q("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                we1Var.q("DROP TABLE `WorkSpec`");
                we1Var.q("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                we1Var.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                we1Var.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                break;
            case 26:
                we1Var.q("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
                we1Var.q("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
                break;
            case 27:
                we1Var.q("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
                break;
            case 28:
                we1Var.q("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                we1Var.q("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                we1Var.q("DROP TABLE `WorkSpec`");
                we1Var.q("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                we1Var.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                we1Var.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                we1Var.q("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
                break;
        }
    }

    @Override // defpackage.jw2
    public void b(x34 x34Var) {
        switch (this.c) {
            case 10:
                h12.n(x34Var, "ALTER TABLE `queue` ADD COLUMN `sampling_rate` INTEGER DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `queue` ADD COLUMN `bit_depth` INTEGER DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `download` ADD COLUMN `sampling_rate` INTEGER DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `download` ADD COLUMN `bit_depth` INTEGER DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `chronology` ADD COLUMN `sampling_rate` INTEGER DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `chronology` ADD COLUMN `bit_depth` INTEGER DEFAULT NULL");
                return;
            case 11:
                h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `lyrics_cache` (`song_id` TEXT NOT NULL, `artist` TEXT, `title` TEXT, `lyrics` TEXT, `structured_lyrics` TEXT, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`song_id`))");
                return;
            case 12:
                h12.n(x34Var, "ALTER TABLE `recent_search` ADD COLUMN `timestamp` INTEGER NOT NULL DEFAULT 0");
                return;
            case 13:
                h12.n(x34Var, "ALTER TABLE `server` ADD COLUMN `client_cert` TEXT DEFAULT NULL");
                return;
            case 14:
                h12.n(x34Var, "ALTER TABLE `queue` ADD COLUMN `rg_track_gain` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `queue` ADD COLUMN `rg_album_gain` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `queue` ADD COLUMN `rg_track_peak` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `queue` ADD COLUMN `rg_album_peak` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `queue` ADD COLUMN `rg_base_gain` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `queue` ADD COLUMN `rg_fallback_gain` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `download` ADD COLUMN `rg_track_gain` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `download` ADD COLUMN `rg_album_gain` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `download` ADD COLUMN `rg_track_peak` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `download` ADD COLUMN `rg_album_peak` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `download` ADD COLUMN `rg_base_gain` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `download` ADD COLUMN `rg_fallback_gain` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `chronology` ADD COLUMN `rg_track_gain` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `chronology` ADD COLUMN `rg_album_gain` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `chronology` ADD COLUMN `rg_track_peak` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `chronology` ADD COLUMN `rg_album_peak` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `chronology` ADD COLUMN `rg_base_gain` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `chronology` ADD COLUMN `rg_fallback_gain` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `session_media_item` ADD COLUMN `rg_track_gain` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `session_media_item` ADD COLUMN `rg_album_gain` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `session_media_item` ADD COLUMN `rg_track_peak` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `session_media_item` ADD COLUMN `rg_album_peak` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `session_media_item` ADD COLUMN `rg_base_gain` REAL DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `session_media_item` ADD COLUMN `rg_fallback_gain` REAL DEFAULT NULL");
                return;
            case 15:
                h12.n(x34Var, "ALTER TABLE `playlist` ADD COLUMN `comment` TEXT DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `playlist` ADD COLUMN `owner` TEXT DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `playlist` ADD COLUMN `isUniversal` INTEGER DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `playlist` ADD COLUMN `songCount` INTEGER NOT NULL DEFAULT 0");
                h12.n(x34Var, "ALTER TABLE `playlist` ADD COLUMN `created` INTEGER DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `playlist` ADD COLUMN `changed` INTEGER DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `playlist` ADD COLUMN `allowedUsers` TEXT DEFAULT NULL");
                h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `pinned_playlist` (`playlistId` TEXT NOT NULL, PRIMARY KEY(`playlistId`))");
                return;
            case WaveRetry.MAX_FAILURES /* 16 */:
                h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `internet_radio_station_cache` (`id` TEXT NOT NULL, `name` TEXT, `stream_url` TEXT, `home_page_url` TEXT, PRIMARY KEY(`id`))");
                return;
            case 17:
                h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `playlist_song` (`playlist_id` TEXT NOT NULL, `id` TEXT NOT NULL, `title` TEXT, `artist` TEXT, `album` TEXT, `track` INTEGER, `cover_art_id` TEXT, `duration` INTEGER, `album_id` TEXT, `artist_id` TEXT, PRIMARY KEY(`playlist_id`, `id`), FOREIGN KEY(`playlist_id`) REFERENCES `playlist`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                h12.n(x34Var, "CREATE INDEX IF NOT EXISTS `index_playlist_song_playlist_id` ON `playlist_song` (`playlist_id`)");
                return;
            case 18:
                h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `_new_playlist_song` (`playlist_id` TEXT NOT NULL, `id` TEXT NOT NULL, `title` TEXT, `artist` TEXT, `album` TEXT, `track` INTEGER, `cover_art_id` TEXT, `duration` INTEGER, `album_id` TEXT, `artist_id` TEXT, PRIMARY KEY(`playlist_id`, `id`), FOREIGN KEY(`playlist_id`) REFERENCES `playlist`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
                h12.n(x34Var, "INSERT INTO `_new_playlist_song` (`playlist_id`,`id`,`title`,`artist`,`album`,`track`,`cover_art_id`,`duration`,`album_id`,`artist_id`) SELECT `playlist_id`,`id`,`title`,`artist`,`album`,`track`,`cover_art_id`,`duration`,`album_id`,`artist_id` FROM `playlist_song`");
                h12.n(x34Var, "DROP TABLE `playlist_song`");
                h12.n(x34Var, "ALTER TABLE `_new_playlist_song` RENAME TO `playlist_song`");
                h12.n(x34Var, "CREATE INDEX IF NOT EXISTS `index_playlist_song_playlist_id` ON `playlist_song` (`playlist_id`)");
                z34 z34VarU = x34Var.U("PRAGMA foreign_key_check(`playlist_song`)");
                try {
                    if (z34VarU.O()) {
                        throw new SQLException(uo.N(z34VarU));
                    }
                    ud3.e(z34VarU, null);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ud3.e(z34VarU, th);
                        throw th2;
                    }
                }
            case 19:
                h12.n(x34Var, "ALTER TABLE `internet_radio_station_cache` ADD COLUMN `source` TEXT NOT NULL DEFAULT 'subsonic'");
                h12.n(x34Var, "ALTER TABLE `internet_radio_station_cache` ADD COLUMN `cover_art_url` TEXT DEFAULT NULL");
                return;
            case 20:
                h12.n(x34Var, "ALTER TABLE `playlist` ADD COLUMN `lastPlayed` INTEGER NOT NULL DEFAULT 0");
                return;
            case 21:
                h12.n(x34Var, "ALTER TABLE `queue` ADD COLUMN `album_artist` TEXT DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `download` ADD COLUMN `album_artist` TEXT DEFAULT NULL");
                h12.n(x34Var, "ALTER TABLE `chronology` ADD COLUMN `album_artist` TEXT DEFAULT NULL");
                return;
            case 22:
                h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `synced_playlist` (`playlistId` TEXT NOT NULL, `serverId` TEXT NOT NULL, PRIMARY KEY(`playlistId`, `serverId`))");
                return;
            default:
                super.b(x34Var);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kw2(int i2, int i3, int i4) {
        super(i2, i3);
        this.c = i4;
    }
}
